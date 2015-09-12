/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.EmpresaConvenio;
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
public class Empresa_convenioSession implements Serializable{

@PersistenceContext
    private EntityManager entityManager;
    
    public void create(EmpresaConvenio empresa_convenio){
        entityManager.persist(empresa_convenio);
    }
    
    public void edit(EmpresaConvenio empresa_convenio){
        entityManager.persist(empresa_convenio);
    }
    
    public void remove(EmpresaConvenio empresa_convenio){
        entityManager.persist(empresa_convenio);
    }
    
    public List<EmpresaConvenio> findAll(){
        CriteriaQuery cq =
                entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(EmpresaConvenio.class));
        return entityManager.createQuery(cq).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
