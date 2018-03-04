/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.persistencia.dao;
import com.prida.generadorInformeseslava.configuracion.Propiedades;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Programacion
 */

public class ConnectBD {
    private Connection conexion;
    private Statement sentencia;
    private String nombre_bd;
    private String usuarioBD;
    private String passwordBD;
    
    public ConnectBD(){
        
    }
 
    protected void establecerConexion() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException{
        
        try {
            Properties p = new Propiedades().cargarPropiedades();
            this.nombre_bd=p.getProperty("nombre_bd");
            this.usuarioBD=p.getProperty("usuarioBD");
            this.passwordBD=p.getProperty("passwordBD");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Linea que carga el driver
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar Dirver");
        }
        try {
            conexion = DriverManager.getConnection("jdbc:ucanaccess://"
                    + this.nombre_bd, this.usuarioBD, this.passwordBD);
            this.sentencia = this.conexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la dirección de la base de datos");
        }
        try {
            sentencia = conexion.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear la conexión con la base de datos");
        }
    }
 
    protected ResultSet ejecutarSentencia(String sql) throws SQLException{
        ResultSet rs;
        rs = this.sentencia.executeQuery(sql);
        return rs;
    }
 
}
