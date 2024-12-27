package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ars")
public class Ars {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo_ars;
    private  String nombre;
    private  String rnc;
    private  String direccion;
    private String telefono;
    private String email;
    private String tipo_aseguradora;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_ars() {
        return codigo_ars;
    }

    public void setCodigo_ars(String codigo_ars) {
        this.codigo_ars = codigo_ars;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRnc() {
        return rnc;
    }

    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_aseguradora() {
        return tipo_aseguradora;
    }

    public void setTipo_aseguradora(String tipo_aseguradora) {
        this.tipo_aseguradora = tipo_aseguradora;
    }


}
