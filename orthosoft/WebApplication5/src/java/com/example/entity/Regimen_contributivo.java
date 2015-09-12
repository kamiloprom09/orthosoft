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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "regimen_contributivo")

public class Regimen_contributivo implements Serializable {

    @Id
    @Column(name = "id_tipo_razon_social")
    private int id_tipo_razon_social;

    @Column(name = "representante_legal")
    private String representantelegal;

   
    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica idclinica;

    

    public Regimen_contributivo() {
    }

    public int getId_tipo_razon_social() {
        return id_tipo_razon_social;
    }

    public void setId_tipo_razon_social(int id_tipo_razon_social) {
        this.id_tipo_razon_social = id_tipo_razon_social;
    }

    
    

   
    public String getRepresentantelegal() {
        return representantelegal;
    }

    public void setRepresentantelegal(String representantelegal) {
        this.representantelegal = representantelegal;
    }

    public Clinica getIdclinica() {
        return idclinica;
    }

    public void setIdclinica(Clinica idclinica) {
        this.idclinica = idclinica;
    }

    
    
    
}
