package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.Facturacion;
import com.consulrorioapi.ConsultorioApi.repositories.FacturacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/facturacion")
public class FacturacionController {

    @Autowired
    private FacturacionRepository facturacionRepository;

    //LISTAR  TODAS LAS FACTURACIONES

    @CrossOrigin
    @GetMapping
    public List<Facturacion> getAllFacturacion(){
        return  facturacionRepository.findAll();
    }

    //BUSCAR FACTURACION POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Facturacion> getFacturacion(@PathVariable Integer id){
        Optional<Facturacion> facturacion = facturacionRepository.findById(id);
        return  facturacion.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CREAR FACTURACION
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Facturacion> createFacturacion(@RequestBody Facturacion facturacion){
        Facturacion saveFacturacion = facturacionRepository.save(facturacion);
        return  ResponseEntity.status(HttpStatus.CREATED).body(saveFacturacion);

    }

    //ELIMINAR FACTURACION
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFacturacion(@PathVariable Integer id){
        if(!facturacionRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        facturacionRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //ACTUALIZAR FACTURACION
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Facturacion> updateFacturacion(@PathVariable Integer id ,@RequestBody Facturacion facturacion){
        if(!facturacionRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        facturacion.setId(id);
        Facturacion saveFacturacion = facturacionRepository.save(facturacion);
        return  ResponseEntity.ok(saveFacturacion);
    }
}
