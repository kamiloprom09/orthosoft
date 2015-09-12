package com.example.entity;

import com.example.entity.Clinica;
import com.example.entity.Departamento;
import com.example.entity.EmpresaConvenio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Convenios_Clinica.class)
public class Convenios_Clinica_ { 

    public static volatile SingularAttribute<Convenios_Clinica, Boolean> estado;
    public static volatile SingularAttribute<Convenios_Clinica, Departamento> id_departamento;
    public static volatile SingularAttribute<Convenios_Clinica, Clinica> id_Clinica;
    public static volatile SingularAttribute<Convenios_Clinica, EmpresaConvenio> id_Convenio;

}