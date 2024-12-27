package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.Prescripciones;
import com.consulrorioapi.ConsultorioApi.repositories.PrescripcionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/prescripciones")
public class PrescripcionesController {

    @Autowired
    private PrescripcionesRepository prescripcionesRepository;


    ///LISTAR TODAS LAS PRESCRIPCIONES
    @CrossOrigin
    @GetMapping
    public List<Prescripciones> getAllPrescripciones(){
        return  prescripcionesRepository.findAll();
    }

    ///BUSCAR PRESCRIPCIONES POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Prescripciones> getPescripcion (@PathVariable Integer id){
        Optional<Prescripciones> prescripcion = prescripcionesRepository.findById(id);
        return  prescripcion.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CRAR PRESCRIPCIONES
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Prescripciones> createPrescripcion(@RequestBody Prescripciones prescripcion){
        Prescripciones prescripciones = prescripcionesRepository.save(prescripcion);
        return  ResponseEntity.status(HttpStatus.CREATED).body(prescripciones);
    }

    //ELIMINAR PRESCRIPCION
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrescripcion(@PathVariable Integer id){
        if(!prescripcionesRepository.existsById(id)){
            return  ResponseEntity.noContent().build();
        }
        prescripcionesRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    //ACTUALIZAR PRESCRIPCION
    @CrossOrigin
    @PutMapping("/{id}")
    public  ResponseEntity<Prescripciones> updatePrescripcion(@PathVariable Integer id,@RequestBody Prescripciones prescripcion){
        if(!prescripcionesRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        prescripcion.setId(id);
        Prescripciones savePrescripcion = prescripcionesRepository.save(prescripcion);
        return  ResponseEntity.ok(savePrescripcion);
    }

}
