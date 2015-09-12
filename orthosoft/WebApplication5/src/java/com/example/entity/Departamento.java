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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {

    @Id
    @Column(name = "Id_departamento")
    private int idDepartamento;

    @Column(name = "Nombre_departamento")
    private String nombre_departamento;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais id_pais;

    @OneToMany(mappedBy = "idDepartamento") //tener en cuenta que falta el private int id ciudades.
    private List<Ciudad> ciudades;

    @OneToMany(mappedBy = "id_departamento")
    private List<Convenios_Clinica> id_departamento;
    public Departamento() {
    }

    public Pais getId_pais() {
        return id_pais;
    }

    public void setId_pais(Pais id_pais) {
        this.id_pais = id_pais;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public List<Convenios_Clinica> getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(List<Convenios_Clinica> id_departamento) {
        this.id_departamento = id_departamento;
    }

    
   

}
