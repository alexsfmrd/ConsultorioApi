package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.Medicamentos;
import com.consulrorioapi.ConsultorioApi.repositories.MedicamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/medicamentos")
public class MedicamentosController {

    @Autowired
    private MedicamentosRepository medicamentosRepository;

    //LISTAR TODOS LOS MEDICAMENTOS
    @CrossOrigin
    @GetMapping
    public List<Medicamentos> getAllMedicamentos(){
        return  medicamentosRepository.findAll();
    }

    //BUSCAR MEDICAMENTO POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Medicamentos> getMedicamentos(@PathVariable Integer id){
        Optional<Medicamentos> medicamentos = medicamentosRepository.findById(id);
        return  medicamentos.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CREAR MEDICAMENTOS
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Medicamentos> createMedicamentos(@RequestBody Medicamentos medicamentos){
        Medicamentos saveMedicamento = medicamentosRepository.save(medicamentos);
        return  ResponseEntity.status(HttpStatus.CREATED).body(saveMedicamento);
    }

    //ELIMINAR MEDICAMENTO
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicamento(@PathVariable Integer id){
        if(!medicamentosRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        medicamentosRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    //ACTUALIZAR MEDICAMENTOS
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Medicamentos> updateMesicamentos(@PathVariable Integer id,@RequestBody Medicamentos medicamentos){
        if(!medicamentosRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        medicamentos.setId(id);
        Medicamentos saveMedicamentos = medicamentosRepository.save(medicamentos);
        return  ResponseEntity.ok(saveMedicamentos);
    }
}
