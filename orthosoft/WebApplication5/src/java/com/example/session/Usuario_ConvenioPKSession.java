/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.session;

import com.example.entity.Usuario_ConvenioPK;
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
    public class Usuario_ConvenioPKSession {

        @PersistenceContext
        private EntityManager entityManager;

        public void create(Usuario_ConvenioPK Usuario_ConvenioPK) {
            entityManager.persist(Usuario_ConvenioPK);
        }

        public void edit(Usuario_ConvenioPK Usuario_ConvenioPK) {
            entityManager.persist(Usuario_ConvenioPK);
        }

        public void remove(Usuario_ConvenioPK Usuario_ConvenioPK) {
            entityManager.persist(Usuario_ConvenioPK);
        }

        public List<Usuario_ConvenioPK> findAll() {
            CriteriaQuery cq
                    = entityManager.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario_ConvenioPK.class));
            return entityManager.createQuery(cq).getResultList();
        }

    }
