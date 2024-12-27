package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.FichaPaciente;
import com.consulrorioapi.ConsultorioApi.repositories.FicahaPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/ficha-paciente")
public class FichaPacienteController {

    @Autowired
    private FicahaPacienteRepository fichaPacienteRepository;

    //LISTAR TODOS
    @CrossOrigin
    @GetMapping
    public List<FichaPaciente> getAllFichaPaciente(){
        return  fichaPacienteRepository.findAll();
    }

    //BUSCAR FICHA POR ID
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<FichaPaciente> getFichaPaciente(@PathVariable Integer id){
        Optional<FichaPaciente> fichaPaciente = fichaPacienteRepository.findById(id);
        return  fichaPaciente.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //CREAR FICHA DE PACIENTE
    @CrossOrigin
    @PostMapping
    public  ResponseEntity<FichaPaciente> createFichaPaciente (@RequestBody FichaPaciente fichaPaciente){
        FichaPaciente fichaPaciente1 = fichaPacienteRepository.save(fichaPaciente);
        return  ResponseEntity.status(HttpStatus.CREATED).body(fichaPaciente1);
    }

    //ELIMINAR FICHA PACIENTE
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFichaPaciente(@PathVariable Integer id){
        if(!fichaPacienteRepository.existsById(id)){
            return  ResponseEntity.noContent().build();
        }
        fichaPacienteRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

    //ACTUALIZAR FICHA PACIENTE
    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<FichaPaciente> updateFichaPaciente(@PathVariable Integer id, @RequestBody FichaPaciente fichaPaciente){
        if(!fichaPacienteRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        fichaPaciente.setId(id);
        FichaPaciente saveFichaPaciente = fichaPacienteRepository.save(fichaPaciente);
        return  ResponseEntity.ok(saveFichaPaciente);
    }


}
