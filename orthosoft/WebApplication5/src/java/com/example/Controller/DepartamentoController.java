/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Departamento;
import com.example.session.DepartamentoSession;
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
public class DepartamentoController implements Serializable{
    
    @EJB
    private DepartamentoSession departamentoSession;
    
    private Departamento selectedDepartamento;
    private List<Departamento> itemsDepartamento = null;

    public DepartamentoController() {
    }

    public DepartamentoSession getDepartamentoSession() {
        return departamentoSession;
    }

    public void setDepartamentoSession(DepartamentoSession departamentoSession) {
        this.departamentoSession = departamentoSession;
    }

     public Departamento getSelectedDepartamento(){
        if ( selectedDepartamento == null) {
             selectedDepartamento = new Departamento(); 
            
        }
        return selectedDepartamento;
    }
    
    
   public void setSelectedDepartamento(Departamento selectedDepartamento) {
        this.selectedDepartamento = selectedDepartamento;
    }
    
    public List<Departamento> getItemsDepartamento() {
        if(itemsDepartamento == null) {
        try {
           itemsDepartamento =  getDepartamentoSession().findAll();
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
        }
        return itemsDepartamento;
    }

    public void setItemsDepartamento(List<Departamento> itemsDepartamento) {
        this.itemsDepartamento = itemsDepartamento;
    }

    public void create() {
        try {
            getDepartamentoSession().create(selectedDepartamento);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
    
    }
    
    
    

