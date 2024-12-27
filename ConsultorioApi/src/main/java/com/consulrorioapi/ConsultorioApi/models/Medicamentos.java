package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "medicamento")
public class Medicamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String codigo_medicamento;
    private  String nombre_medicamento;
    private  String nombre_generico;
    private  String descripcion;
    private String tipo_medicamento;
    private  String dosis_recomendada;
    private String via_administracion;
    private  String presentacion;
    private  String duracion_tratamiento;
    private Date fecha_creacion;
    private String codigo_suplidor;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setCodigo_medicamento(String codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    public String getNombre_generico() {
        return nombre_generico;
    }

    public void setNombre_generico(String nombre_generico) {
        this.nombre_generico = nombre_generico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_medicamento() {
        return tipo_medicamento;
    }

    public void setTipo_medicamento(String tipo_medicamento) {
        this.tipo_medicamento = tipo_medicamento;
    }

    public String getDosis_recomendada() {
        return dosis_recomendada;
    }

    public void setDosis_recomendada(String dosis_recomendada) {
        this.dosis_recomendada = dosis_recomendada;
    }

    public String getVia_administracion() {
        return via_administracion;
    }

    public void setVia_administracion(String via_administracion) {
        this.via_administracion = via_administracion;
    }

    public String getTipo_presentacion() {
        return presentacion;
    }

    public void setTipo_presentacion(String tipo_presentacion) {
        this.presentacion = tipo_presentacion;
    }

    public String getDuracion_tratamiento() {
        return duracion_tratamiento;
    }

    public void setDuracion_tratamiento(String duracion_tratamiento) {
        this.duracion_tratamiento = duracion_tratamiento;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getCodigo_suplidor() {
        return codigo_suplidor;
    }

    public void setCodigo_suplidor(String codigo_suplidor) {
        this.codigo_suplidor = codigo_suplidor;
    }





}
