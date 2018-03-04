/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.modelos;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Programacion
 */
@XmlRootElement
public class Datos {

    private List<Articulo> listaArticulo;
    private List<Escandallo> listaEscandallo;
    private List<Factura> listaFactura;

    public List<Articulo> getListaArticulo() {
        return listaArticulo;
    }

    public void setListaArticulo(List<Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

    public List<Escandallo> getListaEscandallo() {
        return listaEscandallo;
    }

    public void setListaEscandallo(List<Escandallo> listaEscandallo) {
        this.listaEscandallo = listaEscandallo;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

}
