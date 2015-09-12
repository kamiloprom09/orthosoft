/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Tipo_documento;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Hp
 */
@Stateless
public class Tipo_documentoSession implements Serializable {
     
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Tipo_documento tipo_documento){
        entityManager.persist(tipo_documento);
    }
    
    public void edit(Tipo_documento tipo_documento){
        entityManager.persist(tipo_documento);
    }
    
    public void remove(Tipo_documento tipo_documento){
        entityManager.persist(tipo_documento);
    }
    
    public List<Tipo_documento> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Tipo_documento.class));
        return entityManager.createQuery(cq).getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
