/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.persistencia;

import com.prida.generadorInformeseslava.modelos.Articulo;
import java.util.List;

/**
 *
 * @author Programacion
 */
public interface IArticuloDao {

    void guardarArticulos(List<Articulo> lista);

    List<Articulo> getListaArticulos();
}
