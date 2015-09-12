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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "ciudad")
@IdClass(value = CiudadPK.class)
public class Ciudad implements Serializable {

    @Id
    @Column(name = "id_ciudad")
    private int idCiudad;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento idDepartamento;

    @Column(name = "nombre_ciudad")
    private String nombreciudad;

    @OneToMany(mappedBy = "ciudades") //tener en cuenta que falta el private int id ciudad.
    private List<EmpresaConvenio> empresasConvenios;

    @OneToMany(mappedBy = "ciudad") //tener en cuenta que falta el private int id ciudad.
    private List<Sedes> Sedes;

    public Ciudad() {
    }

    public List<EmpresaConvenio> getEmpresasConvenios() {
        return empresasConvenios;
    }

    public void setEmpresasConvenios(List<EmpresaConvenio> empresasConvenios) {
        this.empresasConvenios = empresasConvenios;
    }

    public List<Sedes> getSedes() {
        return Sedes;
    }

    public void setSedes(List<Sedes> Sedes) {
        this.Sedes = Sedes;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

   

    

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

   
   
    }

