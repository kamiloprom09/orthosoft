/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.EmpresaConvenio;
import com.example.session.Empresa_convenioSession;
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
public class Empresa_convenioController implements Serializable {

    @EJB
    private Empresa_convenioSession empresa_convenioSession;

    private EmpresaConvenio selectedEmpresa_convenio;
    private List<EmpresaConvenio> itemsEmpresa_convenio = null;

    public Empresa_convenioController() {
    }

    public Empresa_convenioSession getEmpresa_convenioSession() {
        return empresa_convenioSession;
    }

    public void setEmpresa_convenioSession(Empresa_convenioSession empresa_convenioSession) {
        this.empresa_convenioSession = empresa_convenioSession;
    }

    public EmpresaConvenio getSelectedEmpresa_convenio(){
        if ( selectedEmpresa_convenio == null) {
             selectedEmpresa_convenio = new EmpresaConvenio(); 
            
        }
        return selectedEmpresa_convenio;
    }

    public void setSelectedEmpresa_convenio(EmpresaConvenio selectedEmpresa_convenio) {
        this.selectedEmpresa_convenio = selectedEmpresa_convenio;
    }

    public List<EmpresaConvenio> getItemsEmpresa_convenio() {
        if(itemsEmpresa_convenio == null) {
        try {
           itemsEmpresa_convenio =  getEmpresa_convenioSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsEmpresa_convenio;
    }

    public void setItemsEmpresa_convenio(List<EmpresaConvenio> itemsEmpresa_convenio) {
        this.itemsEmpresa_convenio = itemsEmpresa_convenio;
    }

  

    public void create() {
        try {
            getEmpresa_convenioSession().create(selectedEmpresa_convenio);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
}
