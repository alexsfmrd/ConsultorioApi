package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pagos_factura")
public class PagosFacturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pago;
    private String codigo_factura;
    private Date fecha_pago;
    private int monto_pago;
    private String metodo_pago;
    private String obsevaciones;


    public Integer getId_pago() {
        return id_pago;
    }

    public void setId_pago(Integer id_pago) {
        this.id_pago = id_pago;
    }

    public String getCodigo_factura() {
        return codigo_factura;
    }

    public void setCodigo_factura(String codigo_factura) {
        this.codigo_factura = codigo_factura;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getMonto_pago() {
        return monto_pago;
    }

    public void setMonto_pago(int monto_pago) {
        this.monto_pago = monto_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getObsevaciones() {
        return obsevaciones;
    }

    public void setObsevaciones(String obsevaciones) {
        this.obsevaciones = obsevaciones;
    }



}
