package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.EstudiosMedicos;
import com.consulrorioapi.ConsultorioApi.repositories.EstudiosMedicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/esudios-medicos")
public class EstuiosMedicosController {

    @Autowired
    private EstudiosMedicosRepository estudiosMedicosRepository;

    @CrossOrigin
    @GetMapping
    public List<EstudiosMedicos> getAllEstudiosMedicos(){

        return  estudiosMedicosRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<EstudiosMedicos> getEstudioMedico(@PathVariable Integer id){
        Optional<EstudiosMedicos> estudiosMedicos = estudiosMedicosRepository.findById(id);
        return  estudiosMedicos.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<EstudiosMedicos> createEstudioMedico(@RequestBody EstudiosMedicos estudiosMedicos){
        EstudiosMedicos saveEstudiosMedicos1 = estudiosMedicosRepository.save(estudiosMedicos);
        return  ResponseEntity.status(HttpStatus.CREATED).body(saveEstudiosMedicos1);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudioMedico(@PathVariable Integer id){
        if(!estudiosMedicosRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        estudiosMedicosRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    public  ResponseEntity<EstudiosMedicos> updateEstudioMedico(@PathVariable Integer id, @RequestBody EstudiosMedicos estudiosMedicos){
        if(!estudiosMedicosRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        estudiosMedicos.setId(id);
        EstudiosMedicos saveEstudioMedico = estudiosMedicosRepository.save(estudiosMedicos);
        return  ResponseEntity.ok(saveEstudioMedico);

    }
}
