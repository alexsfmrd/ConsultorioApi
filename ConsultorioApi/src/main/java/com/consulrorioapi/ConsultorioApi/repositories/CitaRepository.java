package com.consulrorioapi.ConsultorioApi.repositories;

import com.consulrorioapi.ConsultorioApi.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Integer> {
}
