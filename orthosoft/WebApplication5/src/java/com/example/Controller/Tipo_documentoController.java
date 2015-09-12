/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Tipo_documento;
import com.example.session.Tipo_documentoSession;
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
public class Tipo_documentoController implements Serializable{
    @EJB
    private Tipo_documentoSession tipo_documentoSession;
    
    private Tipo_documento selectedTipo_documento;
    private List<Tipo_documento> itemsTipo_documento = null;

    public Tipo_documentoController() {
    }

    public Tipo_documentoSession getTipo_documentoSession() {
        return tipo_documentoSession;
    }

    public void setTipo_documentoSession(Tipo_documentoSession tipo_documentoSession) {
        this.tipo_documentoSession = tipo_documentoSession;
    }

    public Tipo_documento getSelectedTipo_documento() {
         if ( selectedTipo_documento == null) {
             selectedTipo_documento = new Tipo_documento(); 
             
         }
        return selectedTipo_documento;
    }

    public void setSelectedTipo_documento(Tipo_documento selectedTipo_documento) {
        this.selectedTipo_documento = selectedTipo_documento;
    }

    public List<Tipo_documento> getItemsTipo_documento() {
        if(itemsTipo_documento == null) {
        try {
           itemsTipo_documento =  getTipo_documentoSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsTipo_documento;
    }

    public void setItemsTipo_documento(List<Tipo_documento> itemsTipo_documento) {
        this.itemsTipo_documento = itemsTipo_documento;
    }

   public void create() {
        try {
            getTipo_documentoSession().create(selectedTipo_documento);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
}
