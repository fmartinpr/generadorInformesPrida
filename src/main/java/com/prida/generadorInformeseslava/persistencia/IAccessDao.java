/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.persistencia;

import com.prida.generadorInformeseslava.modelos.Datos;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Programacion
 */
public interface IAccessDao {

    public Datos importar() throws ClassNotFoundException, IOException, SQLException;
    
}
