/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Convenios_ClinicaPK;
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
public class Convenios_ClinicaPKSession {
@PersistenceContext
    private EntityManager entityManager;
    
    public void create(Convenios_ClinicaPK Convenio_ClinicaPK){
        entityManager.persist(Convenio_ClinicaPK);
    }
    
    public void edit(Convenios_ClinicaPK Convenio_ClinicaPK){
        entityManager.persist(Convenio_ClinicaPK);
    }
    
    public void remove(Convenios_ClinicaPK Convenio_ClinicaPK){
        entityManager.persist(Convenio_ClinicaPK);
    }
    
    public List<Convenios_ClinicaPK> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Convenios_ClinicaPK.class));
        return entityManager.createQuery(cq).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
