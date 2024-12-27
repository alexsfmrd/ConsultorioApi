package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.FacturacionAseguradoras;
import com.consulrorioapi.ConsultorioApi.repositories.FacturacionAseguradorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/facturacion-ars")
public class FacturacionArsController {

    @Autowired
    private FacturacionAseguradorasRepository facturacionAseguradorasRepository;

    //LISTAR TODOS
    @CrossOrigin
    @GetMapping
    public List<FacturacionAseguradoras> getAllFacturacionArs(){
        return  facturacionAseguradorasRepository.findAll();
    }

    //BUSCAR FACTURACION POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<FacturacionAseguradoras> getFacturacionArs(Integer id){
        Optional<FacturacionAseguradoras> facturacionsArs = facturacionAseguradorasRepository.findById(id);
        return  facturacionsArs.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CREAR FACTURACION ARS
    @CrossOrigin
    @PostMapping
    public  ResponseEntity<FacturacionAseguradoras> createFacturacionArs(@RequestBody FacturacionAseguradoras facturacionAseguradoras){
        FacturacionAseguradoras saveFacturacionArs = facturacionAseguradorasRepository.save(facturacionAseguradoras);
        return  ResponseEntity.status(HttpStatus.CREATED).body(saveFacturacionArs);
    }

    //ELIMINAR FACTURACION ARS
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFacturacionArs(@PathVariable Integer id) {
        if (!facturacionAseguradorasRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        facturacionAseguradorasRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //ACTUALIZAR FACTURACION ARS
    @CrossOrigin
    @PutMapping("/{id}")
    public  ResponseEntity<FacturacionAseguradoras> updateFacturacionArs(@PathVariable Integer id, @RequestBody FacturacionAseguradoras facturacionAseguradoras){
        if(!facturacionAseguradorasRepository.existsById(id)){
            return  ResponseEntity.noContent().build();
        }
        facturacionAseguradoras.setId(id);
        FacturacionAseguradoras saveFacturacionars = facturacionAseguradorasRepository.save(facturacionAseguradoras);
        return ResponseEntity.ok(saveFacturacionars);
    }
}
