package com.consulrorioapi.ConsultorioApi.repositories;

import com.consulrorioapi.ConsultorioApi.models.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentosRepository extends JpaRepository<Medicamentos, Integer> {
}
