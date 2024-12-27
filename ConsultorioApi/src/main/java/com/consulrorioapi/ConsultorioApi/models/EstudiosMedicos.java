package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "estudios_medicos")
public class EstudiosMedicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer  id;
    private String codigo_estudio;
    private String codigo_paciente;
    private String tipo_estudio;
    private  String nombre_estudio;
    private Date fecha_estudio;
    private String resultado;
    private String observaciones;
    private String medico_solicita;
    private Date fecha_resultado;
    private  String archivo_resultado;
    private Date fecha_creacion;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_estudio() {
        return codigo_estudio;
    }

    public void setCodigo_estudio(String codigo_estudio) {
        this.codigo_estudio = codigo_estudio;
    }

    public String getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(String codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public String getTipo_estudio() {
        return tipo_estudio;
    }

    public void setTipo_estudio(String tipo_estudio) {
        this.tipo_estudio = tipo_estudio;
    }

    public String getNombre_estudio() {
        return nombre_estudio;
    }

    public void setNombre_estudio(String nombre_estudio) {
        this.nombre_estudio = nombre_estudio;
    }

    public Date getFecha_estudio() {
        return fecha_estudio;
    }

    public void setFecha_estudio(Date fecha_estudio) {
        this.fecha_estudio = fecha_estudio;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMedico_solicita() {
        return medico_solicita;
    }

    public void setMedico_solicita(String medico_solicita) {
        this.medico_solicita = medico_solicita;
    }

    public Date getFecha_resultado() {
        return fecha_resultado;
    }

    public void setFecha_resultado(Date fecha_resultado) {
        this.fecha_resultado = fecha_resultado;
    }

    public String getArchivo_resultado() {
        return archivo_resultado;
    }

    public void setArchivo_resultado(String archivo_resultado) {
        this.archivo_resultado = archivo_resultado;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }


}
