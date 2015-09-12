/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

import java.io.Serializable;

/**
 *
 * @author Hp
 */
public class Usuario_ConvenioPK implements Serializable {
    
    private int id_Convenio;
    private int id_Usuario;

    public Usuario_ConvenioPK() {
    }

    public Usuario_ConvenioPK(int id_Convenio, int id_Usuario) {
        
        this.id_Convenio = id_Usuario;
        this.id_Convenio = id_Usuario;
        
    }

    public int getId_Convenio() {
        return id_Convenio;
    }

    public void setId_Convenio(int id_Convenio) {
        this.id_Convenio = id_Convenio;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_Usuario = id_usuario;
    }
    
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id_Convenio;
        hash = 71 * hash + this.id_Usuario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario_ConvenioPK other = (Usuario_ConvenioPK) obj;
        if (this.id_Convenio != other.id_Usuario) {
            return false;
        }
        if (this.id_Usuario != other.id_Usuario) {
            return false;
        }
        return true;
    } 
    
}
