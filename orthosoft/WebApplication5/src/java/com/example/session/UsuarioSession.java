/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adsi
 */
@Stateless
public class UsuarioSession implements Serializable {
     
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Usuario usuario){
        entityManager.persist(usuario);
    }
    
    public void edit(Usuario usuario){
        entityManager.persist(usuario);
    }
    
    public void remove(Usuario usuario){
        entityManager.persist(usuario);
    }
    
    public List<Usuario> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Usuario.class));
        return entityManager.createQuery(cq).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
