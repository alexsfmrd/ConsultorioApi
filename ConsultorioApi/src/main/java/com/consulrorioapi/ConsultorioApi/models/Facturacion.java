package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "facturacion")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo_factura;
    private String codigo_paciente;
    private Date fecha_factura;
    private Date fecha_vencimiento;
    private int total_factura; ///revisar campo
    private  String servicios_incluidos;
    private String estado_pago;
    private String metodo_pago;
    private int monto_pagado;///revisar campo
    private  String observaciones;
    private Date fecha_creacion;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(String codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public String getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(String codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(int total_factura) {
        this.total_factura = total_factura;
    }

    public String getServicios_incluidos() {
        return servicios_incluidos;
    }

    public void setServicios_incluidos(String servicios_incluidos) {
        this.servicios_incluidos = servicios_incluidos;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public int getMonto_pagado() {
        return monto_pagado;
    }

    public void setMonto_pagado(int monto_pagado) {
        this.monto_pagado = monto_pagado;
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



}
