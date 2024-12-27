package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "prescripciones")
public class Prescripciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String codigo_paciente;
    private  String codigo_medicamento;
    private Date fecha_prescripcion;
    private  String dosis_prescrita;
    private  String frecuencia;
    private  String duracion_tratamiento;
    private  String observaciones;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(String codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public String getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setCodigo_medicamento(String codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public Date getFecha_prescripcion() {
        return fecha_prescripcion;
    }

    public void setFecha_prescripcion(Date fecha_prescripcion) {
        this.fecha_prescripcion = fecha_prescripcion;
    }

    public String getDosis_prescrita() {
        return dosis_prescrita;
    }

    public void setDosis_prescrita(String dosis_prescrita) {
        this.dosis_prescrita = dosis_prescrita;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDuracion_tratamiento() {
        return duracion_tratamiento;
    }

    public void setDuracion_tratamiento(String duracion_tratamiento) {
        this.duracion_tratamiento = duracion_tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
