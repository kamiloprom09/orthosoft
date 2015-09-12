package com.example.entity;

import com.example.entity.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile ListAttribute<Usuario, Roles> roles;
    public static volatile SingularAttribute<Usuario, String> fechadenaciemiento;
    public static volatile SingularAttribute<Usuario, Number> celular;
    public static volatile SingularAttribute<Usuario, Number> telefono;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Integer> idUsuarios;
    public static volatile SingularAttribute<Usuario, String> email;

}