/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Sedes;
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
public class SedesSession implements Serializable{
 @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Sedes sedes){
        entityManager.persist(sedes);
    }
    
    public void edit(Sedes sedes){
        entityManager.persist(sedes);
    }
    
    public void remove(Sedes sedes){
        entityManager.persist(sedes);
    }
    
    public List<Sedes> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Sedes.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
