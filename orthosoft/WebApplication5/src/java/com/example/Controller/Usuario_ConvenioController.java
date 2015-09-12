/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Usuario_Convenio;
import com.example.session.Usuario_ConvenioSession;
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
public class Usuario_ConvenioController implements Serializable {

    @EJB
    private Usuario_ConvenioSession usuario_convenioSession;

    private Usuario_Convenio selectedUsuario_Convenio;
    private List<Usuario_Convenio> itemsUsuario_Convenio = null;

    public Usuario_ConvenioController() {
    }

    public Usuario_ConvenioSession getUsuario_convenioSession() {
        return usuario_convenioSession;
    }

    public void setUsuario_convenioSession(Usuario_ConvenioSession usuario_convenioSession) {
        this.usuario_convenioSession = usuario_convenioSession;
    }

    public Usuario_Convenio getSelectedUsuario_Convenio() {
        if (selectedUsuario_Convenio == null) {
            selectedUsuario_Convenio = new Usuario_Convenio();
        }
        return selectedUsuario_Convenio;
    }

    public void setSelectedUsuario_Convenio(Usuario_Convenio selectedUsuario_Convenio) {
        this.selectedUsuario_Convenio = selectedUsuario_Convenio;
    }

    public List<Usuario_Convenio> getItemsUsuario_Convenio() {
        if (itemsUsuario_Convenio == null) {
            try {
                itemsUsuario_Convenio = getUsuario_convenioSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsUsuario_Convenio;
    }

    public void setItemsUsuario_Convenio(List<Usuario_Convenio> itemsUsuario_Convenio) {
        this.itemsUsuario_Convenio = itemsUsuario_Convenio;
    }

    public void create() {
    try{
        getUsuario_convenioSession().create(selectedUsuario_Convenio);
    } catch (Exception ex ) {
        System.err.println(ex.getMessage());
    }
        }
    
    
}
