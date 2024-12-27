package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.FichaPaciente;
import com.consulrorioapi.ConsultorioApi.models.Suplidor;
import com.consulrorioapi.ConsultorioApi.repositories.SuplidoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/suplidor")
public class SuplidorController {

    @Autowired
    private SuplidoresRepository suplidoresRepository;


    //LISTAR TODOS
    @CrossOrigin
    @GetMapping
    public List<Suplidor>getAllSuplidores(){
        return  suplidoresRepository.findAll();
    }

    //BUSCAR SUPLIDOR POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Suplidor> getSuplidor(@PathVariable Integer id){
        Optional<Suplidor> suplidor = suplidoresRepository.findById(id);
        return  suplidor.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CREAR SUPLIDOR
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Suplidor> createSuplidor(@RequestBody Suplidor suplidor){
        Suplidor createSuplidor = suplidoresRepository.save(suplidor);
        return  ResponseEntity.status(HttpStatus.CREATED).body(createSuplidor);
    }

    //ELIMINAR FICHA PACIENTE
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSuplidor(@PathVariable Integer id){
        if(!suplidoresRepository.existsById(id)){
            return  ResponseEntity.noContent().build();
        }
        suplidoresRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    //ACTUALIZAR FICHA PACIENTE
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Suplidor> updateFichaPaciente(@PathVariable Integer id, @RequestBody Suplidor suplidor){
        if(!suplidoresRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        suplidor.setId(id);
        Suplidor saveSuplidor = suplidoresRepository.save(suplidor);
        return  ResponseEntity.ok(saveSuplidor);
    }

}
