/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Programacion
 */
public interface IAccionService {
    void importar() throws ClassNotFoundException, IOException, SQLException;
    void exportar() throws JAXBException, FileNotFoundException, IOException;
    void importarXml() throws JAXBException;
}
