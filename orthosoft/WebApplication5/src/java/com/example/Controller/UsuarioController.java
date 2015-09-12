/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Usuario;
import com.example.session.UsuarioSession;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author adsi
 */
@ManagedBean
@ViewScoped
public class UsuarioController implements Serializable {
    
    @EJB
    private UsuarioSession usuarioSession;
    
   private Usuario selectedUsuario;
   private List<Usuario> itemsUsuario = null;

    public UsuarioController() {
    }

    public UsuarioSession getUsuarioSession() {
        return usuarioSession;
    }

    public void setUsuarioSession(UsuarioSession usuarioSession) {
        this.usuarioSession = usuarioSession;
    }

    public Usuario getSelectedUsuario() {
        if ( selectedUsuario == null) {
             selectedUsuario = new Usuario();  
        }
        return  selectedUsuario;
    }

    public void setSelectedUsuario(Usuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

    public List<Usuario> getItemsUsuario() {
     if(itemsUsuario == null) {
        try {
           itemsUsuario =  getUsuarioSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsUsuario;
    } 

    public void setItemsUsuario(List<Usuario> itemsUsuario) {
        this.itemsUsuario = itemsUsuario;
    }

    public void create() {
        try {
             getUsuarioSession().create(selectedUsuario);  
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            
        }
    }
}
    

     
     
     
 
   
    
    
    

  