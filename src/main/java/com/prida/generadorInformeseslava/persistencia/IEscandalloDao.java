/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.persistencia;
import com.prida.generadorInformeseslava.modelos.Escandallo;
import java.util.List;

/**
 *
 * @author Programacion
 */
public interface IEscandalloDao {
    void guardarEscandallos(List<Escandallo> lista);

    List<Escandallo> getListaEscandallos();
}
