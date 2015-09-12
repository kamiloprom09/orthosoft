/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Sedes;
import com.example.session.SedesSession;
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
public class SedesController  implements Serializable{
    
    @EJB
    private SedesSession sedesSession;
    
    private Sedes selectedSedes;
    private List<Sedes> itemsSedes = null;

    public SedesController() {
    }

    public SedesSession getSedesSession() {
        return sedesSession;
    }

    public void setSedesSession(SedesSession sedesSession) {
        this.sedesSession = sedesSession;
    }
    
    public Sedes getSelectedSedes(){
        if ( selectedSedes == null) {
             selectedSedes = new Sedes(); 
            
        }
        return selectedSedes;
    }

    public void setSelectedSedes(Sedes selectedSedes) {
        this.selectedSedes  = selectedSedes;
    }
    
    public List<Sedes> getItemsSedes() {
        if(itemsSedes == null) {
        try {
           itemsSedes =  getSedesSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsSedes;
    }

     public void setItemsSedes (List<Sedes> itemsSedes) {
        this.itemsSedes = itemsSedes;
    }

   public void create() {
        try {
            getSedesSession().create(selectedSedes);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
    
    
}
