package com.consulrorioapi.ConsultorioApi.repositories;

import com.consulrorioapi.ConsultorioApi.models.Facturacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturacionRepository extends JpaRepository<Facturacion,Integer> {
}
