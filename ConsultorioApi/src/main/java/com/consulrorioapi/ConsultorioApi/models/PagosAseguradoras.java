package com.consulrorioapi.ConsultorioApi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pagos_aseguradoras")
public class PagosAseguradoras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String codigo_facturacion;
    private Date fecha_pago;
    private int monto_pago;
    private String metodo_pago;
    private  String observaciopnes;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo_facturacion() {
        return codigo_facturacion;
    }

    public void setCodigo_facturacion(String codigo_facturacion) {
        this.codigo_facturacion = codigo_facturacion;
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

    public String getObservaciopnes() {
        return observaciopnes;
    }

    public void setObservaciopnes(String observaciopnes) {
        this.observaciopnes = observaciopnes;
    }

    public enum tipoMetodoPagoArs{
        Transferencia,Cheque,Otros
    }


}
