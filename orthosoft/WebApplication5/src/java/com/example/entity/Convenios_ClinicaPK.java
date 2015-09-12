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

public class Convenios_ClinicaPK implements Serializable {
   
    private int id_Convenio;
    private int id_Clinica;

    public Convenios_ClinicaPK() {

    }

    public Convenios_ClinicaPK(int id_Convenio, int id_Clinica) {
        this.id_Convenio = id_Convenio;
        this.id_Clinica = id_Clinica;
    }

    public int getIdConvenio() {
        return id_Convenio;
    }

    public void setIdConvenio(int id_Convenio) {
        this.id_Convenio = id_Convenio;
    }

    public int getIdClinica() {
        return id_Clinica;
    }

    public void setIdClinica(int id_Clinica) {
        this.id_Clinica = id_Clinica;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id_Convenio;
        hash = 71 * hash + this.id_Clinica;
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
        final Convenios_ClinicaPK other = (Convenios_ClinicaPK) obj;
        if (this.id_Convenio != other.id_Clinica) {
            return false;
        }
        if (this.id_Clinica != other.id_Convenio) {
            return false;
        }
        return true;
    } 
    
}
