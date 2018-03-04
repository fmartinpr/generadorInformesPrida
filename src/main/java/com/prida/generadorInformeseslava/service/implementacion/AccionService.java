/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.service.implementacion;

import com.prida.generadorInformeseslava.modelos.Datos;
import com.prida.generadorInformeseslava.persistencia.IAccessDao;
import com.prida.generadorInformeseslava.persistencia.IArticuloDao;
import com.prida.generadorInformeseslava.persistencia.IEscandalloDao;
import com.prida.generadorInformeseslava.persistencia.IFacturaDao;
import com.prida.generadorInformeseslava.persistencia.dao.AccessDao;
import com.prida.generadorInformeseslava.service.IAccionService;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Programacion
 */
@Service("accionService")
@Transactional
public class AccionService implements IAccionService {
    
    private final IAccessDao accessDao = new AccessDao();
    private Datos datos;
    @Autowired
    private IArticuloDao articuloDao;
    @Autowired
    private IEscandalloDao escandalloDao;
    @Autowired
    private IFacturaDao facturaDao;
    private JAXBContext context;
    private final Date fecha = new Date(Calendar.getInstance().getTime().getTime());
    
    public void importar() throws ClassNotFoundException, IOException, SQLException {
        datos = accessDao.importar();
        articuloDao.guardarArticulos(datos.getListaArticulo());
        escandalloDao.guardarEscandallos(datos.getListaEscandallo());
        facturaDao.guardarFacturas(datos.getListaFactura());
    }
    
    public void exportar() throws JAXBException, FileNotFoundException, IOException {
        datos = new Datos();
        datos.setListaArticulo(articuloDao.getListaArticulos());
        String DATO_DAT_FILE = "dato-" + fecha.toString() + ".dat";
        
        context = JAXBContext.newInstance(Datos.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Mostramos el documento XML generado por la salida estandar
        marshaller.marshal(datos, System.out);
        
        FileOutputStream fos = new FileOutputStream(DATO_DAT_FILE);
        //guardamos el objeto serializado en un documento XML
        marshaller.marshal(datos, fos);
        fos.close();
        
    }
    
    public void importarXml() throws JAXBException {
        String DATO_DAT_FILE = "dato-" + fecha.toString() + ".dat";
        Unmarshaller unmarshaller;
        context = JAXBContext.newInstance(Datos.class);
        unmarshaller = context.createUnmarshaller();
        //Deserealizamos a partir de un documento XML
        datos = (Datos) unmarshaller.unmarshal(new File(DATO_DAT_FILE));
        articuloDao.guardarArticulos(datos.getListaArticulo());
    }
}
