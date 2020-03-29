/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.proyectoPanal.DAO;

import org.springframework.data.repository.CrudRepository;
import com.ufro.proyectoPanal.modelo.Usuario;
import java.util.List;
/**
 *
 * @author hotpc
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

    @Override
    public List<Usuario> findAll();
    
    public Usuario findByNombreAndPassword(String user, String pass);

}
