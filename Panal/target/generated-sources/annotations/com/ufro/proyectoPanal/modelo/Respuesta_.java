package com.ufro.proyectoPanal.modelo;

import com.ufro.proyectoPanal.modelo.Ideas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-27T23:51:40")
@StaticMetamodel(Respuesta.class)
public class Respuesta_ { 

    public static volatile SingularAttribute<Respuesta, String> contenido;
    public static volatile SingularAttribute<Respuesta, Ideas> ideasid;
    public static volatile SingularAttribute<Respuesta, Integer> id;
    public static volatile SingularAttribute<Respuesta, Integer> progreso;
    public static volatile SingularAttribute<Respuesta, String> urlImagen;

}