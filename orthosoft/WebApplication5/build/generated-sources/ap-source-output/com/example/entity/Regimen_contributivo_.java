package com.example.entity;

import com.example.entity.Clinica;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Regimen_contributivo.class)
public class Regimen_contributivo_ { 

    public static volatile SingularAttribute<Regimen_contributivo, Integer> id_tipo_razon_social;
    public static volatile SingularAttribute<Regimen_contributivo, Clinica> idclinica;
    public static volatile SingularAttribute<Regimen_contributivo, String> representantelegal;

}