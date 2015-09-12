package com.example.entity;

import com.example.entity.Departamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, Integer> idpais;
    public static volatile SingularAttribute<Pais, String> nombrepais;
    public static volatile ListAttribute<Pais, Departamento> id_pais;

}