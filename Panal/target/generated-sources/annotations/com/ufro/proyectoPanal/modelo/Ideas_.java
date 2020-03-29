package com.ufro.proyectoPanal.modelo;

import com.ufro.proyectoPanal.modelo.Respuesta;
import com.ufro.proyectoPanal.modelo.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:51:40")
@StaticMetamodel(Ideas.class)
public class Ideas_ { 

    public static volatile SingularAttribute<Ideas, String> objetivo;
    public static volatile SingularAttribute<Ideas, String> contenido;
    public static volatile SingularAttribute<Ideas, String> tema;
    public static volatile ListAttribute<Ideas, Respuesta> respuestaList;
    public static volatile SingularAttribute<Ideas, Integer> id;
    public static volatile SingularAttribute<Ideas, String> nombre;
    public static volatile SingularAttribute<Ideas, Usuario> usuarioid;
    public static volatile SingularAttribute<Ideas, String> motivacion;
    public static volatile SingularAttribute<Ideas, String> urlImagen;

}