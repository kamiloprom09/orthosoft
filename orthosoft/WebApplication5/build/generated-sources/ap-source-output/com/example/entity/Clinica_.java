package com.example.entity;

import com.example.entity.Regimen_contributivo;
import com.example.entity.Sedes;
import com.example.entity.Tipo_documento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Clinica.class)
public class Clinica_ { 

    public static volatile SingularAttribute<Clinica, Tipo_documento> id_documento;
    public static volatile SingularAttribute<Clinica, Integer> idClinica;
    public static volatile SingularAttribute<Clinica, Regimen_contributivo> id_tipo_razon_social;
    public static volatile ListAttribute<Clinica, Regimen_contributivo> idclinica;
    public static volatile SingularAttribute<Clinica, String> nombreClinica;
    public static volatile SingularAttribute<Clinica, Number> telefono;
    public static volatile ListAttribute<Clinica, Sedes> id_clinica;
    public static volatile SingularAttribute<Clinica, String> email;

}