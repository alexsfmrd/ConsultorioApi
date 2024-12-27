package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.Ars;
import com.consulrorioapi.ConsultorioApi.repositories.ArsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/ars")
public class ArsController {

    @Autowired
    private ArsRepository arsRepository;

    //listar todas la ars
    @CrossOrigin
    @GetMapping
    public List<Ars> getAllArs(){
        return  arsRepository.findAll();
    }

    //buacar ars por id
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Ars> getArs(@PathVariable Integer id){
        Optional<Ars> ars = arsRepository.findById(id);
        return  ars.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //Crear Ars
    @CrossOrigin
    @PostMapping
    public  ResponseEntity<Ars> createArs(@RequestBody Ars ars){
        Ars savedArs = arsRepository.save(ars);
        return  ResponseEntity.status(HttpStatus.CREATED).body(savedArs);
    }

    //eliminar Ars
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArs(@PathVariable Integer id){
        if(!arsRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        arsRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    //Actulizar ars
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Ars> updateArs(@PathVariable Integer id, @RequestBody Ars ars){
        if(!arsRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        ars.setId(id);
        Ars saveArs = arsRepository.save(ars);
        return  ResponseEntity.ok(saveArs);
    }
}
