/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Convenios_ClinicaPK;
import com.example.session.Convenios_ClinicaPKSession;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Hp
 */
public class Convenios_ClinicaPKController {
    
    @EJB
    private Convenios_ClinicaPKSession Convenio_ClinicaPKSession;
    private Convenios_ClinicaPK selectConvenios_ClinicaPK;
    private List<Convenios_ClinicaPK> itemsConvenios_ClinicaPK = null;
    private String id_Convenio;
    private String id_Clinica;

    public Convenios_ClinicaPKController() {
    }
    
    

    public String getId_Convenio() {
        return id_Convenio;
    }

    public void setId_Convenio(String id_Convenio) {
        this.id_Convenio = id_Convenio;
    }

    public String getId_Clinica() {
        return id_Clinica;
    }

    public void setId_Clinica(String id_Clinica) {
        this.id_Clinica = id_Clinica;
    }

    public Convenios_ClinicaPKSession getConvenio_ClinicaPKSession() {
        return Convenio_ClinicaPKSession;
    }

    public List<Convenios_ClinicaPK> getItemsConvenios_ClinicaPK() {
        if (itemsConvenios_ClinicaPK == null) {
            try {
                itemsConvenios_ClinicaPK = getConvenio_ClinicaPKSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }   
        }
return itemsConvenios_ClinicaPK;
    }

    public Convenios_ClinicaPK getSelectConvenios_ClinicaPK() {
        return selectConvenios_ClinicaPK;
    }

    public void setConvenio_ClinicaPKSession(Convenios_ClinicaPKSession Convenio_ClinicaPKSession) {
        this.Convenio_ClinicaPKSession = Convenio_ClinicaPKSession;
    }
    
    
    
    
}
