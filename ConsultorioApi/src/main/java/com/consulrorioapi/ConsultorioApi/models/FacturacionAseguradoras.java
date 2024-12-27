package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "facturacion_aseguradora")
public class FacturacionAseguradoras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String codigo_facturac;
    private  String codigo_paciente;
    private  String codigo_ars;
    private Date fecha_factura;
    private String servicios_facturados;
    private  int monto_total;
    private  int monto_aseguradora;
    private  int monto_paciente;
    private String estado_pago;
    private String metodo_pago;
    private  Date fecha_creacion;
    private  Date fecha_vencimiento;
    private  Date fecha_pago;
    private String observaciones;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_facturac() {
        return codigo_facturac;
    }

    public void setCodigo_facturac(String codigo_facturac) {
        this.codigo_facturac = codigo_facturac;
    }

    public String getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(String codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public String getCodigo_ars() {
        return codigo_ars;
    }

    public void setCodigo_ars(String codigo_ars) {
        this.codigo_ars = codigo_ars;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public String getServicios_facturados() {
        return servicios_facturados;
    }

    public void setServicios_facturados(String servicios_facturados) {
        this.servicios_facturados = servicios_facturados;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }

    public int getMonto_aseguradora() {
        return monto_aseguradora;
    }

    public void setMonto_aseguradora(int monto_aseguradora) {
        this.monto_aseguradora = monto_aseguradora;
    }

    public int getMonto_paciente() {
        return monto_paciente;
    }

    public void setMonto_paciente(int monto_paciente) {
        this.monto_paciente = monto_paciente;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


}
