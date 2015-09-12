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
@Table(name = "usuarios_convenio")
@IdClass(value = Usuario_ConvenioPK.class)
public class Usuario_Convenio implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_usuarios")
    private Usuario id_Usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_convenio")
    private EmpresaConvenio id_Convenio;

    @Column(name = "estado")
    private boolean estado;

    public Usuario_Convenio() {
    }

  

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Usuario id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public EmpresaConvenio getId_Convenio() {
        return id_Convenio;
    }

    public void setId_Convenio(EmpresaConvenio id_Convenio) {
        this.id_Convenio = id_Convenio;
    }

    

}
