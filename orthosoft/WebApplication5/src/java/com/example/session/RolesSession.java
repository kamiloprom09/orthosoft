/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Roles;
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
public class RolesSession implements Serializable {
     
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Roles roles){
        entityManager.persist(roles);
    }
    
    public void edit(Roles roles){
        entityManager.persist(roles);
    }
    
    public void remove(Roles roles){
        entityManager.persist(roles);
    }
    
    public List<Roles> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Roles.class));
        return entityManager.createQuery(cq).getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
