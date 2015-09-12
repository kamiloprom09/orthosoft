package com.example.entity;

import com.example.entity.Clinica;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Tipo_documento.class)
public class Tipo_documento_ { 

    public static volatile SingularAttribute<Tipo_documento, Integer> id_documento;
    public static volatile ListAttribute<Tipo_documento, Clinica> id_docuemnto;
    public static volatile SingularAttribute<Tipo_documento, String> tipodocumento;

}