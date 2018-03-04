/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prida.generadorInformeseslava.persistencia.dao;

import com.prida.generadorInformeseslava.modelos.Articulo;
import com.prida.generadorInformeseslava.persistencia.IArticuloDao;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Programacion
 */
@Repository("articuloDao")
public class ArticuloDAO extends AbstractDao implements IArticuloDao{
    public void guardarArticulos(List<Articulo> lista) {
       for(Articulo articulo : lista){
           this.getSession().saveOrUpdate(articulo);
       }
    }

    public List<Articulo> getListaArticulos() {
        Criteria criteria = getSession().createCriteria(Articulo.class);
        List<Articulo> lista = (List<Articulo>) criteria.list();
        return lista;
    }
    
}
