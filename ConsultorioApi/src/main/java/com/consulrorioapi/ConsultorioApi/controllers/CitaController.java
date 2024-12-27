package com.consulrorioapi.ConsultorioApi.controllers;


import com.consulrorioapi.ConsultorioApi.models.Cita;
import com.consulrorioapi.ConsultorioApi.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/citas")
public class CitaController {

    @Autowired
    private CitaRepository citaRepository;

    @CrossOrigin
    @GetMapping
    public List<Cita> getAllCitas(){
        return  citaRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Cita> getCita(@PathVariable Integer id){
        Optional<Cita> cita = citaRepository.findById(id);
        return  cita.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    @CrossOrigin
    @PostMapping
    public  ResponseEntity<Cita> createCita(@RequestBody Cita cita){
        Cita saveCita = citaRepository.save(cita);
        return  ResponseEntity.status(HttpStatus.CREATED).body(saveCita);

    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deleteCita(@PathVariable Integer id){
        if (!citaRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        citaRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Cita> updateCita(@PathVariable Integer id, @RequestBody Cita cita){
        if(!citaRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        cita.setId(id);
        Cita saveCita = citaRepository.save(cita);
        return  ResponseEntity.ok(saveCita);
    }


}
