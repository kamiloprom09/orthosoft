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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "clinica")
public class Clinica implements Serializable {

    @Id
    @Column(name = "id_clinica")
    private int idClinica;

    @Column(name = "nombre_clinica")
    private String nombreClinica;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private Number telefono;

    @ManyToOne
    @JoinColumn(name = "id_documento")
    private Tipo_documento id_documento;
    
  
    @ManyToOne
    @JoinColumn(name = "id_tipo_razon_social")
    private Regimen_contributivo id_tipo_razon_social;
   
    @OneToMany(mappedBy = "id_clinica")
    private List<Sedes> id_clinica;

    @OneToMany(mappedBy = "idclinica")
    private List<Regimen_contributivo> idclinica;
    
    public Clinica() {
    }

    public List<Sedes> getId_clinica() {
        return id_clinica;
    }

    public void setId_clinica(List<Sedes> id_clinica) {
        this.id_clinica = id_clinica;
    }

    

    public Tipo_documento getId_documento() {
        return id_documento;
    }

    public void setId_documento(Tipo_documento id_documento) {
        this.id_documento = id_documento;
    }

   

    

    public int getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Number getTelefono() {
        return telefono;
    }

    public void setTelefono(Number telefono) {
        this.telefono = telefono;
    }

    public Regimen_contributivo getId_tipo_razon_social() {
        return id_tipo_razon_social;
    }

    public void setId_tipo_razon_social(Regimen_contributivo id_tipo_razon_social) {
        this.id_tipo_razon_social = id_tipo_razon_social;
    }

    public List<Regimen_contributivo> getIdclinica() {
        return idclinica;
    }

    public void setIdclinica(List<Regimen_contributivo> idclinica) {
        this.idclinica = idclinica;
    }

  

  
    
    
    
    
    }

   

    
    
    
