/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Regimen_contributivo;
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
public class Regimen_contributivoSession implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Regimen_contributivo regimen_contributivo) {
        entityManager.persist(regimen_contributivo);
    }

    public void edit(Regimen_contributivo regimen_contributivo) {
        entityManager.persist(regimen_contributivo);
    }

    public void remove(Regimen_contributivo regimen_contributivo) {
        entityManager.persist(regimen_contributivo);
    }

    public List<Regimen_contributivo> findAll() {
        CriteriaQuery cq
                = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Regimen_contributivo.class));
        return entityManager.createQuery(cq).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
