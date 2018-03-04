/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.configuracion;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Programacion
 */
public class Propiedades {
    private Properties p;

    public Propiedades() {
       
    }

    public Properties cargarPropiedades() throws IOException {
        p = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties");
        p.load(inputStream);
        return p;
    }
    
    public void guardarPropiedades(){
        
    }
    
}
