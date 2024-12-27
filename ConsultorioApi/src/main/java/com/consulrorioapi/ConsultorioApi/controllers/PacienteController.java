package com.consulrorioapi.ConsultorioApi.controllers;

import com.consulrorioapi.ConsultorioApi.models.Pacientes;
import com.consulrorioapi.ConsultorioApi.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository  pacienteRepository;

    //listar todos los pacientes
    @CrossOrigin
    @GetMapping
    public List<Pacientes> getAllPacientes(){
        return  pacienteRepository.findAll();
    }

    //buscar paciente por id
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Pacientes> getPacienteById(@PathVariable Integer id){
        Optional<Pacientes> pacientes = pacienteRepository.findById(id);
        return pacientes.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }

    //crear pacientes
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Pacientes> createPacientes(@RequestBody Pacientes paciente){
        Pacientes savedPaciente = pacienteRepository.save(paciente);
        return  ResponseEntity.status(HttpStatus.CREATED).body(savedPaciente);
    }


    //eliminar pacientes
    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaciente(@PathVariable Integer id){
        if(!pacienteRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        pacienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //actualizar pacientes
    @CrossOrigin
    @PutMapping("/{id}")
    public  ResponseEntity<Pacientes> updatePaciente(@PathVariable Integer id, @RequestBody Pacientes paciente){
        if(!pacienteRepository.existsById(id)){
            return  ResponseEntity.notFound().build();
        }
        paciente.setId(id);
        Pacientes savePaciente = pacienteRepository.save(paciente);
        return  ResponseEntity.ok(savePaciente);
    }
}
