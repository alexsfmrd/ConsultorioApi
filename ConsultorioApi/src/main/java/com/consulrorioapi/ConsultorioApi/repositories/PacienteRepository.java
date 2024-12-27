package com.consulrorioapi.ConsultorioApi.repositories;

import com.consulrorioapi.ConsultorioApi.models.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Pacientes, Integer  > {
}
