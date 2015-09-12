/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.CiudadPK;
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
public class CiudadesPKSession {
@PersistenceContext
    private EntityManager entityManager;
    
    public void create(CiudadPK CiudadPK){
        entityManager.persist(CiudadPK);
    }
    
    public void edit(CiudadPK CiudadesPK){
        entityManager.persist(CiudadesPK);
    }
    
    public void remove(CiudadPK CiudadesPK){
        entityManager.persist(CiudadesPK);
    }
    
    public List<CiudadPK> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(CiudadPK.class));
        return entityManager.createQuery(cq).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
