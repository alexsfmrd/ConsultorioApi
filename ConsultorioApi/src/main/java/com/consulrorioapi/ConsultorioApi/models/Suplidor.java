package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "suplidor")
public class Suplidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo_suplidor;
    private String nombre;
    private String rnc;
    private String telefono;
    private String direccion;
    private String email;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_suplidor() {
        return codigo_suplidor;
    }

    public void setCodigo_suplidor(String codigo_suplidor) {
        this.codigo_suplidor = codigo_suplidor;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
