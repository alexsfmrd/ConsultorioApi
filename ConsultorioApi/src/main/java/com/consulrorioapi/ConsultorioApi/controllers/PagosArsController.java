package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.PagosAseguradoras;
import com.consulrorioapi.ConsultorioApi.repositories.PagosAseguradorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pagos-ars")
public class PagosArsController {

    @Autowired
    private PagosAseguradorasRepository pagosArs;

    //LISTAR TODOS LOS PAGOS ARS
    @CrossOrigin
    @GetMapping
    public List<PagosAseguradoras> getAllPagosArs(){
        return  pagosArs.findAll();
    }

    //BUSCAR PAGOS ARS POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<PagosAseguradoras> getPagoArs(@PathVariable Integer id){
        Optional<PagosAseguradoras> pagoArs = pagosArs.findById(id);
        return  pagoArs.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CREAR PAGOS ARS
    @CrossOrigin
    @PostMapping
    public ResponseEntity<PagosAseguradoras> createPagosArs(@RequestBody PagosAseguradoras pagosAseguradora){
        PagosAseguradoras pagosAseguradoras = pagosArs.save(pagosAseguradora);
        return  ResponseEntity.status(HttpStatus.CREATED).body(pagosAseguradoras);
    }

    //ELIMINAR PAGOS ASEGURADORAS
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePagosArs(@PathVariable Integer id){
        if (!pagosArs.existsById(id)) {
            return  ResponseEntity.noContent().build();
        }
        pagosArs.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    //ACTUALIZAR PAGOS ARS
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<PagosAseguradoras> updatePagosArs(@PathVariable Integer id, @RequestBody PagosAseguradoras pagosAseguradoras){
        if(!pagosArs.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        pagosAseguradoras.setId(id);
        PagosAseguradoras pagoArs = pagosArs.save(pagosAseguradoras);
        return  ResponseEntity.ok(pagoArs);
    }
}
