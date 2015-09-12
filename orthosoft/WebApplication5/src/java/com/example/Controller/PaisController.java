/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Pais;
import com.example.session.PaisSession;
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
public class PaisController implements Serializable {

    @EJB
    private PaisSession paisSession;

    private Pais selectedPais;
    private List<Pais> itemsPais = null;

    public PaisController() {
    }

    public PaisSession getPaisSession() {
        return paisSession;
    }

    public void setPaisSession(PaisSession paisSession) {
        this.paisSession = paisSession;
    }

    public Pais getSelectedPais() {
        if (selectedPais == null) {
            selectedPais = new Pais();

        }
        return selectedPais;
    }

    public void setSelectedPais(Pais selectedPais) {
        this.selectedPais = selectedPais;
    }

    public List<Pais> getItemsPais() {
        if (itemsPais == null) {
            try {
                itemsPais = getPaisSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsPais;
    }

    public void setItemsPais(List<Pais> itemsPais) {
        this.itemsPais = itemsPais;
    }
    public void create() {
        try {
            getPaisSession().create(selectedPais);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }
}
