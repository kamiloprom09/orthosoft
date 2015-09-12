/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Usuario_Convenio;
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
public class Usuario_ConvenioSession {

    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Usuario_Convenio usuario_convenio){
        entityManager.persist(usuario_convenio);
    }
    
    public void edit(Usuario_Convenio usuario_convenio){
        entityManager.persist(usuario_convenio);
    }
    
    public void remove(Usuario_Convenio usuario_convenio){
        entityManager.persist(usuario_convenio);
    }
    
    public List<Usuario_Convenio> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Usuario_Convenio.class));
        return entityManager.createQuery(cq).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
