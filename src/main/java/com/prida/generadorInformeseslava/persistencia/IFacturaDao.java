/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.persistencia;

import com.prida.generadorInformeseslava.modelos.Factura;
import java.util.List;

/**
 *
 * @author fmartin
 */
public interface IFacturaDao {

    void guardarFacturas(List<Factura> lista);

    List<Factura> getListaFacturas();
}
