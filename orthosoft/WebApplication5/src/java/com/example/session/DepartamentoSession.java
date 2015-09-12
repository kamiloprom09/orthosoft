/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Departamento;
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
public class DepartamentoSession implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Departamento departamneto) {
        entityManager.persist(departamneto);
    }

    public void edit(Departamento departamento) {
        entityManager.persist(departamento);
    }

    public void remove(Departamento departamento) {
        entityManager.persist(departamento);
    }

    public List<Departamento> findAll() {
        CriteriaQuery cq
                = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Departamento.class));
        return entityManager.createQuery(cq).getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
