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
@Table(name="tipo_documento")
public class Tipo_documento implements Serializable {

    @Id
    @Column(name = "id_documento")
    private int id_documento; // hay que areglar mappeby de id_documento que aparece en error

    @Column(name = "tipo_documento")
    private String tipodocumento;
        
    @OneToMany(mappedBy = "id_documento")
    private List<Clinica> id_docuemnto;
   
    public Tipo_documento() {
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public List<Clinica> getId_docuemnto() {
        return id_docuemnto;
    }

    public void setId_docuemnto(List<Clinica> id_docuemnto) {
        this.id_docuemnto = id_docuemnto;
    }

    

    
    public int getIddocumento() {
        return id_documento;
    }

    public void setIddocumento(int iddocumento) {
        this.id_documento = iddocumento;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

}
