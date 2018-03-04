/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.persistencia.dao;

import com.prida.generadorInformeseslava.modelos.Escandallo;
import com.prida.generadorInformeseslava.persistencia.IEscandalloDao;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Programacion
 */
@Repository("escandalloDao")
public class EscandalloDao extends AbstractDao implements IEscandalloDao{
        public void guardarEscandallos(List<Escandallo> lista) {
       for(Escandallo escandallo : lista){
           this.getSession().saveOrUpdate(escandallo);
       }
    }

    public List<Escandallo> getListaEscandallos() {
        Criteria criteria = getSession().createCriteria(Escandallo.class);
        List<Escandallo> lista = (List<Escandallo>) criteria.list();
        return lista;
    }
}
