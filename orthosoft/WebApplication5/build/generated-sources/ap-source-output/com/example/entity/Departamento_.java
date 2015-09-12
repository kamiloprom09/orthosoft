package com.example.entity;

import com.example.entity.Ciudad;
import com.example.entity.Convenios_Clinica;
import com.example.entity.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDepartamento;
    public static volatile ListAttribute<Departamento, Convenios_Clinica> id_departamento;
    public static volatile SingularAttribute<Departamento, String> nombre_departamento;
    public static volatile SingularAttribute<Departamento, Pais> id_pais;
    public static volatile ListAttribute<Departamento, Ciudad> ciudades;

}