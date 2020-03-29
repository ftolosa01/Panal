/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.proyectoPanal.DAO;

import org.springframework.data.repository.CrudRepository;
import com.ufro.proyectoPanal.modelo.*;
import java.util.List;

/**
 *
 * @author hotpc
 */
public interface RespuestaDAO extends CrudRepository<Respuesta, Integer> {

    public Respuesta findById(int id);

    @Override
    public List<Respuesta> findAll();

   
    public Respuesta deleteById(int id);

}
