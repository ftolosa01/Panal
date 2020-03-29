/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.proyectoPanal.DAO;

import org.springframework.data.repository.CrudRepository;
import com.ufro.proyectoPanal.modelo.Ideas;
import java.util.List;

/**
 *
 * @author hotpc
 */
public interface IdeasDAO extends CrudRepository<Ideas, Integer> {

    @Override
    public List<Ideas> findAll();

    public List<Ideas> findByTema(String tema);

   public Ideas deleteById(int id);
   public Ideas findById(int id);

}
