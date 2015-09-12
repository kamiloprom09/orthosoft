/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;


import com.example.entity.CiudadPK;
import com.example.session.CiudadesPKSession;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author LAS HERMANAS
 */
public class CiudadesPKController {
     @EJB
    private CiudadesPKSession CiudadesPKSession;
    private CiudadPK selectCiudadesPK;
    private List<CiudadPK> itemsCiudadesPK = null;
    private String idpais;
            
    public CiudadesPKController() {

    }

    public String getIdpais() {
        return idpais;
    }

    public void setIdpais(String idpais) {
        this.idpais = idpais;
    }
    
    

    public CiudadesPKSession getCiudadesPKSession() {
        return CiudadesPKSession;
    }

    public List<CiudadPK> getItemsCiudadesPK() {
        if (itemsCiudadesPK == null) {
            try {
                itemsCiudadesPK = getCiudadesPKSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsCiudadesPK;
    }

    public CiudadPK getSelectCiudadesPK() {
        return selectCiudadesPK;
    }

    public void setCiudadesPKSession(CiudadPK CiudadesPKSession) {
        this.selectCiudadesPK = selectCiudadesPK;
    }
    
}
