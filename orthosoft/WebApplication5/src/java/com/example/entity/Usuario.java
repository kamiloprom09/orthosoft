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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author adsi
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    
    @Id
    @Column(name = "id_usuarios")
    private int idUsuarios;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellidos")
    private String apellido;
    
    @Column(name = "fecha_de_naciemiento")
    private String fechadenaciemiento;
     
    @Column(name = "telefono")
    private Number telefono;
      
    @Column(name = "celular")
    private Number celular;
       
    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "id_usuario")
     private List<Roles> tipo_rol;
    
    
    public Usuario() {
    }

    
    
    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechadenaciemiento() {
        return fechadenaciemiento;
    }

    public void setFechadenaciemiento(String fechadenaciemiento) {
        this.fechadenaciemiento = fechadenaciemiento;
    }

    public Number getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Number getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Roles> getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(List<Roles> tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    

    
    
  
}
