

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.example.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hp
 */


@Entity
@Table(name = "convenios_clinica")
@IdClass(value = Convenios_ClinicaPK.class)
public class Convenios_Clinica implements Serializable {
 
    @Id
    @ManyToOne
    @JoinColumn(name = "id_convenio")
    private EmpresaConvenio id_Convenio;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private Clinica id_Clinica;
    
    @Column(name = "estado")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento id_departamento;

    public Convenios_Clinica() {
    }

    public EmpresaConvenio getId_Convenio() {
        return id_Convenio;
    }

    public void setId_Convenio(EmpresaConvenio id_Convenio) {
        this.id_Convenio = id_Convenio;
    }

    public Clinica getId_Clinica() {
        return id_Clinica;
    }

    public void setId_Clinica(Clinica id_Clinica) {
        this.id_Clinica = id_Clinica;
    }

    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Departamento getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(Departamento id_departamento) {
        this.id_departamento = id_departamento;
    }
    
    
    
    
    
 }
