/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Ciudad;
import com.example.session.CiudadSession;
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
public class CiudadController implements Serializable{
    
    @EJB
    private CiudadSession CiudadSession;
    
    private Ciudad selectedCiudad;
    private List<Ciudad> itemsCiudad = null;

    public CiudadController() {
    }

    public CiudadSession getCiudadSession() {
        return CiudadSession;
    }

    public void setCiudadSession(CiudadSession CiudadSession) {
        this.CiudadSession = CiudadSession;
    }

    public Ciudad getSelectedCiudad() {
        if ( selectedCiudad == null) {
             selectedCiudad = new Ciudad(); 
            
        }
        return selectedCiudad;
    }

    public void setSelectedCiudad(Ciudad selectedCiudad) {
        this.selectedCiudad = selectedCiudad;
    }

    public List<Ciudad> getItemsCiudad() {
        if(itemsCiudad == null) {
        try {
           itemsCiudad =  getCiudadSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsCiudad;
    }

    public void setItemsCiudad(List<Ciudad> itemsCiudad) {
        this.itemsCiudad = itemsCiudad;
    }
    
     public void create() {
        try {
            getCiudadSession().create(selectedCiudad);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
    
    
    
    
    
    }