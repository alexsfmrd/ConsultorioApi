package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ficha_paciente")
public class FichaPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String codigo_paciente;
    private  int edad;
    private  int peso;
    private  String tipo_sanguineo;
    private  String estatura;
    private  boolean alergico;
    private String alergias;
    private String enfermedades_previa;
    private String historial_familiar;
    private String observaciones;
    private String historial_quirurgico;
    private Date fecha_ultima_consulta;



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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedades_previa() {
        return enfermedades_previa;
    }

    public void setEnfermedades_previa(String enfermedades_previa) {
        this.enfermedades_previa = enfermedades_previa;
    }

    public String getHistorial_familiar() {
        return historial_familiar;
    }

    public void setHistorial_familiar(String historial_familiar) {
        this.historial_familiar = historial_familiar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getHistorial_quirurgico() {
        return historial_quirurgico;
    }

    public void setHistorial_quirurgico(String historial_quirurgico) {
        this.historial_quirurgico = historial_quirurgico;
    }

    public Date getFecha_ultima_consulta() {
        return fecha_ultima_consulta;
    }

    public void setFecha_ultima_consulta(Date fecha_ultima_consulta) {
        this.fecha_ultima_consulta = fecha_ultima_consulta;
    }



}
