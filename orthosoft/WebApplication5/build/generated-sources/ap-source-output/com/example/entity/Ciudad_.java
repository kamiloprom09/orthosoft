package com.example.entity;

import com.example.entity.Departamento;
import com.example.entity.EmpresaConvenio;
import com.example.entity.Sedes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, Departamento> idDepartamento;
    public static volatile ListAttribute<Ciudad, Sedes> Sedes;
    public static volatile ListAttribute<Ciudad, EmpresaConvenio> empresasConvenios;
    public static volatile SingularAttribute<Ciudad, Integer> idCiudad;
    public static volatile SingularAttribute<Ciudad, String> nombreciudad;

}