/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.modelos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Programacion
 */
@Entity
@Table(name="ARTICULO")
public class Articulo implements Serializable{
    /*CODIGO*/
    @Id
    private Long id;
    @Column
    private String codigo2;
    @Column
    private double codigoEAN;
    /*A=Artículo, P=Plato, C=Combinado, M=Menú*/
    @Column
    private char tipo; 
    @Column
    private long grupo;
    @Column
    private String nombre;
    @Column
    private double precioCompra;
    @Column
    private double precioMedio;
    @Column
    private double precio;
    @Column
    private double precio1;
    @Column
    private double precio2;
    @Column
    private double precio3;
    @Column
    private String tama;
    @Column
    private String tama1;
    @Column
    private boolean activa1;
    @Column
    private double porcion1;
    @Column
    private double preciop1;
    @Column
    private double preciop11;
    @Column
    private double preciop12;
    @Column
    private double preciop13;
    @Column
    private String tama2;
    @Column
    private boolean activa2;
    @Column
    private double porcion2;
    @Column
    private double preciop2;
    @Column
    private double preciop21;
    @Column
    private double preciop22;
    @Column
    private double preciop23;
    @Column
    private String tama3;
    private boolean activa3;
    @Column
    private double porcion3;
    @Column
    private double preciop3;
    @Column
    private double preciop31;
    @Column
    private double preciop32;
    @Column
    private double preciop33;
    @Column
    private long proveedor;
    @Column
    private char tipoCompra;
    @Column
    private byte ivaCompra;
    @Column
    private double stock;
    @Column
    private long stockMinimo;
    @Column
    private long stockMaximo;
    @Column
    private long unidCaja;
    @Column
    private byte ivaVenta;
    @Column
    private String alergenos;

    public Articulo() {
       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2;
    }

    public double getCodigoEAN() {
        return codigoEAN;
    }

    public void setCodigoEAN(double codigoEAN) {
        this.codigoEAN = codigoEAN;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public long getGrupo() {
        return grupo;
    }

    public void setGrupo(long grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioMedio() {
        return precioMedio;
    }

    public void setPrecioMedio(double precioMedio) {
        this.precioMedio = precioMedio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }

    public double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public double getPrecio3() {
        return precio3;
    }

    public void setPrecio3(double precio3) {
        this.precio3 = precio3;
    }
    
    public String getTama() {
        return tama;
    }

    public void setTama(String tama) {
        this.tama = tama;
    }

    public long getProveedor() {
        return proveedor;
    }

    public void setProveedor(long proveedor) {
        this.proveedor = proveedor;
    }

    public char getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(char tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public byte getIvaCompra() {
        return ivaCompra;
    }

    public void setIvaCompra(byte ivaCompra) {
        this.ivaCompra = ivaCompra;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public long getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(long stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public long getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(long stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public long getUnidCaja() {
        return unidCaja;
    }

    public void setUnidCaja(long unidCaja) {
        this.unidCaja = unidCaja;
    }

    public byte getIvaVenta() {
        return ivaVenta;
    }

    public void setIvaVenta(byte ivaVenta) {
        this.ivaVenta = ivaVenta;
    }

    public String getAlergenos() {
        return alergenos;
    }

    public void setAlergenos(String alergenos) {
        this.alergenos = alergenos;
    }

    public String getTama1() {
        return tama1;
    }

    public void setTama1(String tama1) {
        this.tama1 = tama1;
    }

    public boolean isActiva1() {
        return activa1;
    }

    public void setActiva1(boolean activa1) {
        this.activa1 = activa1;
    }

    public double getPorcion1() {
        return porcion1;
    }

    public void setPorcion1(double porcion1) {
        this.porcion1 = porcion1;
    }

    public double getPreciop1() {
        return preciop1;
    }

    public void setPreciop1(double preciop1) {
        this.preciop1 = preciop1;
    }

    public double getPreciop11() {
        return preciop11;
    }

    public void setPreciop11(double preciop11) {
        this.preciop11 = preciop11;
    }

    public double getPreciop12() {
        return preciop12;
    }

    public void setPreciop12(double preciop12) {
        this.preciop12 = preciop12;
    }

    public double getPreciop13() {
        return preciop13;
    }

    public void setPreciop13(double preciop13) {
        this.preciop13 = preciop13;
    }

    public String getTama2() {
        return tama2;
    }

    public void setTama2(String tama2) {
        this.tama2 = tama2;
    }

    public boolean isActiva2() {
        return activa2;
    }

    public void setActiva2(boolean activa2) {
        this.activa2 = activa2;
    }

    public double getPorcion2() {
        return porcion2;
    }

    public void setPorcion2(double porcion2) {
        this.porcion2 = porcion2;
    }

    public double getPreciop2() {
        return preciop2;
    }

    public void setPreciop2(double preciop2) {
        this.preciop2 = preciop2;
    }

    public double getPreciop21() {
        return preciop21;
    }

    public void setPreciop21(double preciop21) {
        this.preciop21 = preciop21;
    }

    public double getPreciop22() {
        return preciop22;
    }

    public void setPreciop22(double preciop22) {
        this.preciop22 = preciop22;
    }

    public double getPreciop23() {
        return preciop23;
    }

    public void setPreciop23(double preciop23) {
        this.preciop23 = preciop23;
    }

    public String getTama3() {
        return tama3;
    }

    public void setTama3(String tama3) {
        this.tama3 = tama3;
    }

    public boolean isActiva3() {
        return activa3;
    }

    public void setActiva3(boolean activa3) {
        this.activa3 = activa3;
    }

    public double getPorcion3() {
        return porcion3;
    }

    public void setPorcion3(double porcion3) {
        this.porcion3 = porcion3;
    }

    public double getPreciop3() {
        return preciop3;
    }

    public void setPreciop3(double preciop3) {
        this.preciop3 = preciop3;
    }

    public double getPreciop31() {
        return preciop31;
    }

    public void setPreciop31(double preciop31) {
        this.preciop31 = preciop31;
    }

    public double getPreciop32() {
        return preciop32;
    }

    public void setPreciop32(double preciop32) {
        this.preciop32 = preciop32;
    }

    public double getPreciop33() {
        return preciop33;
    }

    public void setPreciop33(double preciop33) {
        this.preciop33 = preciop33;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    
    
}
