package com.consulrorioapi.ConsultorioApi.repositories;

import com.consulrorioapi.ConsultorioApi.models.Prescripciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescripcionesRepository extends JpaRepository<Prescripciones, Integer> {
}
