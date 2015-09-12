package com.example.entity;

import com.example.entity.Ciudad;
import com.example.entity.Clinica;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Sedes.class)
public class Sedes_ { 

    public static volatile SingularAttribute<Sedes, String> Email;
    public static volatile SingularAttribute<Sedes, Ciudad> ciudad;
    public static volatile SingularAttribute<Sedes, Integer> idSede;
    public static volatile SingularAttribute<Sedes, String> telefono;
    public static volatile SingularAttribute<Sedes, Clinica> id_clinica;
    public static volatile SingularAttribute<Sedes, String> nombre;

}