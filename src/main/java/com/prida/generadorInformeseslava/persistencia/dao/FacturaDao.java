/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.persistencia.dao;

import com.prida.generadorInformeseslava.modelos.Factura;
import com.prida.generadorInformeseslava.persistencia.IFacturaDao;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fmartin
 */
@Repository("facturaDao")
public class FacturaDao extends AbstractDao implements IFacturaDao {

    public void guardarFacturas(List<Factura> lista) {
        for (Factura factura : lista) {
            this.getSession().saveOrUpdate(factura);
        }
    }

    public List<Factura> getListaFacturas() {
        Criteria criteria = getSession().createCriteria(Factura.class);
        List<Factura> lista = (List<Factura>) criteria.list();
        return lista;
    }

}
