/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Controller;

import com.example.entity.Roles;
import com.example.session.RolesSession;
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
public class RolesController implements Serializable {

    @EJB
    private RolesSession rolesSession;

    private Roles selectedRoles;
    private List<Roles> itemsRoles = null;

    public RolesController() {
    }

    public RolesSession getRolesSession() {
        return rolesSession;
    }

    public void setRolesSession(RolesSession rolesSession) {
        this.rolesSession = rolesSession;
    }

    public Roles getSelectedRoles() {
        if (selectedRoles == null) {
            selectedRoles = new Roles();

        }
        return selectedRoles;
    }

    public void setSelectedRoles(Roles selectedRoles) {
        this.selectedRoles = selectedRoles;
    }

    
    public List<Roles> getItemsRoles() {
        if (itemsRoles == null) {
            try {
                itemsRoles = getRolesSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsRoles;
    }

    public void setItemsRoles(List<Roles> itemsRoles) {
        this.itemsRoles = itemsRoles;
    }

    public void create() {
        try {
            getRolesSession().create(selectedRoles);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        }
    }

}
