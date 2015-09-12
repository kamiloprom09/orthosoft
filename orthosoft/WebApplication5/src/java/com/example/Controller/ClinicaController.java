/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Clinica;
import com.example.session.ClinicaSession;
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
public class ClinicaController implements Serializable{
    
    @EJB
    private ClinicaSession clinicaSession;
    
    private Clinica selectedclinica;
    private List<Clinica> itemsclinica = null;

    public ClinicaController() {
    }

    public ClinicaSession getClinicaSession() {
        return clinicaSession;
    }

    public void setClinicaSession(ClinicaSession clinicaSession) {
        this.clinicaSession = clinicaSession;
    }

    public Clinica getSelectedClinica(){
        if ( selectedclinica == null) {
             selectedclinica = new Clinica(); 
            
        }
        return selectedclinica;
    }
   
    public void setSelectedClinica(Clinica selectedClinica) {
        this.selectedclinica = selectedClinica;
    }
     public List<Clinica> getItemsClinica() {
        if(itemsclinica == null) {
        try {
           itemsclinica =  getClinicaSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsclinica;
    }


    public void setItemsClinica(List<Clinica> itemsClinica) {
        this.itemsclinica = itemsClinica;
    }
    
    public void create() {
        try {
            getClinicaSession().create(selectedclinica);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
}
