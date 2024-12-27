package com.consulrorioapi.ConsultorioApi.controllers;


import com.consulrorioapi.ConsultorioApi.models.PagosFacturas;
import com.consulrorioapi.ConsultorioApi.repositories.PagosFacturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pagos-facturas")
public class PagosFacturasController {

    @Autowired
    private PagosFacturasRepository pagosFacturas;


    //LISTAR TODOS LOS PAGOS
    @CrossOrigin
    @GetMapping
    public List<PagosFacturas> getAllPagosFacturas(){
        return  pagosFacturas.findAll();
    }

    //BUSCAR PAGOS POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<PagosFacturas> getPagosFactura (@PathVariable Integer id){
        Optional<PagosFacturas> pagos = pagosFacturas.findById(id);
        return  pagos.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CREAR PAGO FACTURAS
    @CrossOrigin
    @PostMapping
    public  ResponseEntity<PagosFacturas> createPagosFactura(@RequestBody PagosFacturas pagoFacturas){
        PagosFacturas pagofactura = pagosFacturas.save(pagoFacturas);
        return  ResponseEntity.status(HttpStatus.CREATED).body(pagofactura);
    }

    //ELIMINAR PAGO FACTURA
    @CrossOrigin
    @DeleteMapping("/{id}")
    public  ResponseEntity<Void>deletePagoFactuara(@PathVariable Integer id){
        if (!pagosFacturas.existsById(id)){
            return  ResponseEntity.noContent().build();
        }
        pagosFacturas.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    //ACTUALISAR PAGO FACTURA
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<PagosFacturas> updatePagoFactura(@PathVariable Integer id,@RequestBody PagosFacturas pagosFacturas1){
        if(!pagosFacturas.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        pagosFacturas1.setId_pago(id);
        PagosFacturas savePagoFactura = pagosFacturas.save(pagosFacturas1);
        return  ResponseEntity.ok(savePagoFactura);
    }
}
