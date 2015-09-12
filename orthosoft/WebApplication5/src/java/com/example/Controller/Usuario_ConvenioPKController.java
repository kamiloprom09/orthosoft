/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Usuario_ConvenioPK;
import com.example.session.Usuario_ConvenioPKSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Hp
 */
public class Usuario_ConvenioPKController implements Serializable{
    
   @EJB
    private Usuario_ConvenioPKSession Usuario_ConvenioPKSession;
    private Usuario_ConvenioPK selectUsuario_ConvenioPK;
    private List<Usuario_ConvenioPK> itemsUsuario_ConvenioPK = null;
    private String id_Convenio;
    private String id_Usuario;

    public Usuario_ConvenioPKController() {
    }

    public String getId_Convenio() {
        return id_Convenio;
    }

    public void setId_Convenio(String id_Convenio) {
        this.id_Convenio = id_Convenio;
    }

    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Usuario_ConvenioPKSession getUsuario_ConvenioPKSession() {
        return Usuario_ConvenioPKSession;
    }

    public List<Usuario_ConvenioPK> getItemsUsuario_ConvenioPK() {
         if (itemsUsuario_ConvenioPK == null) {
            try {
                itemsUsuario_ConvenioPK = getUsuario_ConvenioPKSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsUsuario_ConvenioPK;
    }

    public Usuario_ConvenioPK getSelectUsuario_ConvenioPK() {
        return selectUsuario_ConvenioPK;
    }

    public void setUsuario_ConvenioPKSession(Usuario_ConvenioPKSession Usuario_ConvenioPKSession) {
        this.Usuario_ConvenioPKSession = Usuario_ConvenioPKSession;
    }

            
   

  

}
