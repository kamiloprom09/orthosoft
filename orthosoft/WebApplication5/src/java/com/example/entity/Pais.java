/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hp
 */
@Entity
@Table(name="pais")
public class Pais implements Serializable {
    @Id
    @Column(name = "id_pais")
    private int idpais;

    @Column(name = "nombre_pais")
    private String nombrepais;
    
   
    @OneToMany(mappedBy = "id_pais")
    private List<Departamento> id_pais;
    
    
    
    
    public Pais() {
    }

    public List<Departamento> getId_pais() {
        return id_pais;
    }

    public void setId_pais(List<Departamento> id_pais) {
        this.id_pais = id_pais;
    }

   

  
   
    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }
    
    
    
}
