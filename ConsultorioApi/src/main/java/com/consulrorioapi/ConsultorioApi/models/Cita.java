package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String codigo_cita;
    private  String codigo_paciente;
    private Date fecha_cita;
    private Date hora_cita;
    private String estado;
    private String tipo_consulta;
    private String observaciones;
    private  Date fecha_creacion;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_cita() {
        return codigo_cita;
    }

    public void setCodigo_cita(String codigo_cita) {
        this.codigo_cita = codigo_cita;
    }

    public String getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(String codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public Date getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(Date hora_cita) {
        this.hora_cita = hora_cita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public enum Estado{
        Pendiente,Confirmada,Cancelada,Realizada
    }

    public enum tipoConsulta{
        Consulta_general,Consulta_emergencia,Consulta_personalizada
    }




}
