

package com.example.session;

import com.example.entity.Convenios_Clinica;
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
public class Convenios_ClinicaSession implements Serializable {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(Convenios_Clinica Convenios_Clinica){
               entityManager.persist(Convenios_Clinica);
    }
    
    public void edit(Convenios_Clinica Convenios_Clinica){
        entityManager.persist(Convenios_Clinica);
    } 
    
     public void remove(Convenios_Clinica Convenios_Clinica){
        entityManager.persist(Convenios_Clinica);
    } 
     
     public List<Convenios_Clinica> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Convenios_Clinica.class));
        return entityManager.createQuery(cq).getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}