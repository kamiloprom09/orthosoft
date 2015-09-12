/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;


import com.example.entity.Ciudad;
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
public class CiudadSession implements Serializable {
     
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Ciudad Ciudad){
        entityManager.persist(Ciudad);
    }
    
    public void edit(Ciudad Ciudad){
        entityManager.persist(Ciudad);
    }
    
    public void remove(Ciudad Ciudad){
        entityManager.persist(Ciudad);
    }
    
    public List<Ciudad> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Ciudad.class));
        return entityManager.createQuery(cq).getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}


