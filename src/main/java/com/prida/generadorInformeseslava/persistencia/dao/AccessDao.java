/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.persistencia.dao;

import com.prida.generadorInformeseslava.modelos.Articulo;
import com.prida.generadorInformeseslava.modelos.Datos;
import com.prida.generadorInformeseslava.modelos.Escandallo;
import com.prida.generadorInformeseslava.modelos.Factura;
import com.prida.generadorInformeseslava.persistencia.IAccessDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Programacion
 */
public class AccessDao extends ConnectBD implements IAccessDao {

    public Datos importar() throws ClassNotFoundException, IOException, SQLException {
        Datos datosImportar = new Datos();
        establecerConexion();
        datosImportar.setListaArticulo(importarArticulos());
        datosImportar.setListaEscandallo(importarEscandallo());
        datosImportar.setListaFactura(importarFactura());
        return datosImportar;
    }

    private List<Articulo> importarArticulos() throws SQLException {
        List<Articulo> lista = new ArrayList<Articulo>();
        String sentencia = "SELECT * FROM RESTAL01";
        ResultSet rs = ejecutarSentencia(sentencia);
        while (rs.next()) {
            Articulo art = new Articulo();
            art.setId(rs.getLong("CODIGO"));
            art.setCodigo2(rs.getString("CODIGO2"));
            art.setCodigoEAN(rs.getDouble("EAN"));
            art.setTipo(rs.getString("TIPO").charAt(0));
            art.setGrupo(rs.getLong("GRUPO"));
            art.setNombre(rs.getString("ESPAÑOL"));
            art.setPrecioCompra(rs.getDouble("PRECIOCOMPRA"));
            art.setPrecioMedio(rs.getDouble("PRECIOMEDIO"));
            art.setIvaVenta(rs.getByte("IVAVENTA"));
            art.setPrecio(rs.getDouble("PRECIO"));
            art.setPrecio1(rs.getDouble("PRECIO1"));
            art.setPrecio2(rs.getDouble("PRECIO2"));
            art.setPrecio3(rs.getDouble("PRECIO3"));
            art.setProveedor(rs.getLong("PROVEEDOR"));
            String tipoCompra = rs.getString("TIPOCOMPRA");
            if (tipoCompra != null) {
                art.setTipoCompra(tipoCompra.charAt(0));
            }
            art.setIvaCompra(rs.getByte("IVACOMPRAS"));
            art.setStock(rs.getLong("STOCK"));
            art.setUnidCaja(rs.getLong("UNDCAJA"));
            art.setStockMinimo(rs.getLong("BAJOMINIMO"));
            art.setStockMaximo(rs.getLong("STOCKMAXIMO"));
            art.setTama1(rs.getString("TAMA1"));
            art.setActiva1(rs.getBoolean("ACTIVA1"));
            art.setPorcion1(rs.getDouble("PORCION1"));
            art.setPreciop1(rs.getDouble("PRECIOP1"));
            art.setPreciop11(rs.getDouble("PRECIOP11"));
            art.setPreciop12(rs.getDouble("PRECIOP12"));
            art.setPreciop13(rs.getDouble("PRECIOP13"));
            art.setTama2(rs.getString("TAMA2"));
            art.setActiva2(rs.getBoolean("ACTIVA2"));
            art.setPorcion2(rs.getDouble("PORCION2"));
            art.setPreciop2(rs.getDouble("PRECIOP2"));
            art.setPreciop21(rs.getDouble("PRECIOP21"));
            art.setPreciop22(rs.getDouble("PRECIOP22"));
            art.setPreciop23(rs.getDouble("PRECIOP23"));
            art.setTama3(rs.getString("TAMA3"));
            art.setActiva3(rs.getBoolean("ACTIVA3"));
            art.setPorcion3(rs.getDouble("PORCION3"));
            art.setPreciop3(rs.getDouble("PRECIOP3"));
            art.setPreciop31(rs.getDouble("PRECIOP31"));
            art.setPreciop32(rs.getDouble("PRECIOP32"));
            art.setPreciop33(rs.getDouble("PRECIOP33"));
            art.setTama(rs.getString("TAMA0"));
            art.setAlergenos(rs.getString("ALERGENOS"));
            lista.add(art);
        }
        return lista;
    }

    private List<Escandallo> importarEscandallo() throws SQLException {
        List<Escandallo> lista = new ArrayList<Escandallo>();
        String sentencia = "SELECT * FROM RESTES01 WHERE TIPOESCAN = 'E'";
        ResultSet rs = ejecutarSentencia(sentencia);
        while (rs.next()) {
            Escandallo esc = new Escandallo();
            esc.setId(rs.getLong("NRLINEA"));
            esc.setCodigo(rs.getLong("CODIGO"));
            esc.setIdArticulo(rs.getLong("ARTICULO"));
            esc.setPorcion(rs.getDouble("PORCION"));
            esc.setTipoScandallo(rs.getString("TIPOESCAN").charAt(0));
            esc.setValor(rs.getDouble("VALOR"));
            lista.add(esc);
        }

        return lista;
    }

    private List<Factura> importarFactura() throws SQLException {
        List<Factura> lista = new ArrayList<Factura>();
        String sentencia = "SELECT * FROM RESTOM02";
        ResultSet rs = ejecutarSentencia(sentencia);
        while (rs.next()) {
            Factura fra = new Factura();
            fra.setIdFactura(rs.getLong("NRFACTURA"));
            fra.setCamarero(rs.getInt("CAMARERO"));
            fra.setCliente(rs.getLong("NRCLIENTE"));
            fra.setCobro(rs.getString("COBRO"));
            fra.setComensales(rs.getLong("COMENSALES"));
            fra.setDescuento(rs.getDouble("DESCUENTO"));
            fra.setExento(rs.getDouble("EXENTO"));
            fra.setFecha(rs.getDate("FECHA"));
            fra.setHora(rs.getTime("HORA"));
            fra.setImporte(rs.getLong("IMPORTE"));
            fra.setImporteIva(rs.getDouble("IMPORTEIVA"));
            fra.setIva(rs.getByte("IVA"));
            fra.setNeto(rs.getDouble("NETO"));
            fra.setNumeroMesa(rs.getInt("NRMESA"));
            fra.setRecequ(rs.getDouble("RECEQU"));
            fra.setSerie(rs.getString("SERIE"));
            fra.setIdCobro(rs.getInt("TIPCOBRO"));
            fra.setTipoIva(rs.getByte("TIPOIVA"));
            fra.setnArqueo(rs.getLong("NRARQUEO"));
            fra.setnComensales(rs.getLong("NOCOMENSALES"));
            lista.add(fra);
        }

        return lista;
    }

}
