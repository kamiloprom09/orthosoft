


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.Controller;

import com.example.entity.Convenios_Clinica;
import com.example.session.Convenios_ClinicaSession;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Hp
 */


@ManagedBean
@ViewScoped
public class Convenios_ClinicaController implements Serializable {
    
    @EJB
    private Convenios_ClinicaSession Convenios_ClinicaSession;
    
    private Convenios_Clinica selectedConvenios_Clinica;
    private List<Convenios_Clinica> itemsConvenios_Clinica = null;

    public Convenios_ClinicaSession getConvenios_ClinicaSession() {
        return Convenios_ClinicaSession;
    }

    public void setConvenios_ClinicaSession(Convenios_ClinicaSession Convenios_ClinicaSession) {
        this.Convenios_ClinicaSession = Convenios_ClinicaSession;
    }

    public Convenios_Clinica getSelectedConvenios_Clinica() {
         if ( selectedConvenios_Clinica == null) {
             selectedConvenios_Clinica = new Convenios_Clinica (); 
            
        }
        return selectedConvenios_Clinica;
    }

    public void setSelectedConvenios_Clinica(Convenios_Clinica selectedConvenios_Clinica) {
        this.selectedConvenios_Clinica = selectedConvenios_Clinica;
    }

    public List<Convenios_Clinica> getItemsConvenios_Clinica() {
        if(itemsConvenios_Clinica == null) {
        try {
           itemsConvenios_Clinica =  getConvenios_ClinicaSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsConvenios_Clinica;
    }

    public void setItemsConvenios_Clinica(List<Convenios_Clinica> itemsConvenios_Clinica) {
        this.itemsConvenios_Clinica = itemsConvenios_Clinica;
    }

    
    
    public void create() {
        try {
            getConvenios_ClinicaSession().create(selectedConvenios_Clinica);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
    
}
