package com.example.entity;

import com.example.entity.Ciudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(EmpresaConvenio.class)
public class EmpresaConvenio_ { 

    public static volatile SingularAttribute<EmpresaConvenio, String> direccion;
    public static volatile SingularAttribute<EmpresaConvenio, String> telefono;
    public static volatile SingularAttribute<EmpresaConvenio, String> nombre;
    public static volatile SingularAttribute<EmpresaConvenio, Integer> idConvenio;
    public static volatile SingularAttribute<EmpresaConvenio, Integer> email;
    public static volatile SingularAttribute<EmpresaConvenio, Ciudad> ciudades;

}