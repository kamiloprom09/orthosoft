/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Regimen_contributivo;
import com.example.session.Regimen_contributivoSession;
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
public class Regimen_contributivoCntroller implements Serializable {

    @EJB
    private Regimen_contributivoSession regimen_contributivoSession;

    private Regimen_contributivo selectedRegimen_contributivo;
    private List<Regimen_contributivo> itemsRegimen_contributivo = null;

    public Regimen_contributivoCntroller() {
    }

    public Regimen_contributivoSession getRegimen_contributivoSession() {
        return regimen_contributivoSession;
    }

    public void setRegimen_contributivoSession(Regimen_contributivoSession regimen_contributivoSession) {
        this.regimen_contributivoSession = regimen_contributivoSession;
    }

    public Regimen_contributivo getSelectedRegimen_contributivo() {
        if (selectedRegimen_contributivo == null) {
            selectedRegimen_contributivo = new Regimen_contributivo();
        }
        return selectedRegimen_contributivo;
    }

    public void setSelectedRegimen_contributivo(Regimen_contributivo selectedRegimen_contributivo) {
        this.selectedRegimen_contributivo = selectedRegimen_contributivo;
    }

    public List<Regimen_contributivo> getItemsRegimen_contributivo() {
         if (itemsRegimen_contributivo == null) {
            try {
                itemsRegimen_contributivo = getRegimen_contributivoSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsRegimen_contributivo;
    }

    public void setItemsRegimen_contributivo(List<Regimen_contributivo> itemsRegimen_contributivo) {
        this.itemsRegimen_contributivo = itemsRegimen_contributivo;
    }
    
    public void create() {
        try {
            getRegimen_contributivoSession().create(selectedRegimen_contributivo);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
    
}
