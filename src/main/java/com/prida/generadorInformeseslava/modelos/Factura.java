/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.modelos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Programacion
 */
@Entity
@Table(name = "FACTURA")
public class Factura implements Serializable {

    @Id
    private Long idFactura;
    @Id
    private int idCobro;
    @Column(length = 25)
    private String cobro;
    @Column
    private int numeroMesa;
    @Column
    private double importe;
    @Column
    private int camarero;
    @Column
    private long cliente;
    @Column
    private Time hora;
    @Column
    private Date fecha;
    @Column
    private double descuento;
    @Column
    private byte tipoIva;
    @Column
    private double neto;
    @Column
    private double exento;
    @Column
    private double recequ;
    @Column
    private double iva;
    @Column
    private long comensales;
    @Column
    private double importeIva;
    @Column
    private long nArqueo;
    @Column(length = 2)
    private String serie;
    @Column
    private long nComensales;

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCamarero() {
        return camarero;
    }

    public void setCamarero(int camarero) {
        this.camarero = camarero;
    }

    public long getCliente() {
        return cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public byte getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(byte tipoIva) {
        this.tipoIva = tipoIva;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getExento() {
        return exento;
    }

    public void setExento(double exento) {
        this.exento = exento;
    }

    public double getRecequ() {
        return recequ;
    }

    public void setRecequ(double recequ) {
        this.recequ = recequ;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(int idCobro) {
        this.idCobro = idCobro;
    }

    public String getCobro() {
        return cobro;
    }

    public void setCobro(String cobro) {
        this.cobro = cobro;
    }

    public long getComensales() {
        return comensales;
    }

    public void setComensales(long comensales) {
        this.comensales = comensales;
    }

    public double getImporteIva() {
        return importeIva;
    }

    public void setImporteIva(double importeIva) {
        this.importeIva = importeIva;
    }

    public long getnArqueo() {
        return nArqueo;
    }

    public void setnArqueo(long nArqueo) {
        this.nArqueo = nArqueo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public long getnComensales() {
        return nComensales;
    }

    public void setnComensales(long nComensales) {
        this.nComensales = nComensales;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.idFactura != null ? this.idFactura.hashCode() : 0);
        hash = 67 * hash + this.idCobro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.idCobro != other.idCobro) {
            return false;
        }
        if (this.idFactura != other.idFactura && (this.idFactura == null || !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }
}
