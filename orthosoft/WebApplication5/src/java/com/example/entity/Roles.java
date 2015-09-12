/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "roles")

public class Roles implements Serializable {

    @Id
    @Column(name = "id_rol")
    private int idrol;

    @Column(name = "nombre_rol")
    private String nombrerol;
    
    
    

     @ManyToMany
     @JoinTable(name="tipo_rol", joinColumns={@JoinColumn(name="id_usuario")}, inverseJoinColumns={@JoinColumn(name="id_rol")})
     private List<Usuario> tipo_rol;
    
    public Roles() {
    }

    
    
    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombrerol() {
        return nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    public List<Usuario> getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(List<Usuario> tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    

    

    

    
    
    
}
