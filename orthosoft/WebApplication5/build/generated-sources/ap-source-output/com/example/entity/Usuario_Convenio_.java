package com.example.entity;

import com.example.entity.EmpresaConvenio;
import com.example.entity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-09T13:41:17")
@StaticMetamodel(Usuario_Convenio.class)
public class Usuario_Convenio_ { 

    public static volatile SingularAttribute<Usuario_Convenio, Boolean> estado;
    public static volatile SingularAttribute<Usuario_Convenio, Usuario> id_Usuario;
    public static volatile SingularAttribute<Usuario_Convenio, EmpresaConvenio> id_Convenio;

}