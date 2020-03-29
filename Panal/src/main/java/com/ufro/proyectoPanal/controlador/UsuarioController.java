/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.proyectoPanal.controlador;

import com.ufro.proyectoPanal.DAO.UsuarioDAO;
import com.ufro.proyectoPanal.modelo.Usuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hotpc
 */
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioDAO UDao;

    @GetMapping("/Usuario")
    public String Ideas(Model model) {

        model.addAttribute("UsuariosCreados", new Usuario());

        return "Usuario";

    }

    @PostMapping("/Usuario")
    public String crearUsuario(@ModelAttribute Usuario e) {
        
        UDao.save(e);
        return "index";
    }

    @GetMapping("/Login")
    public String mostrarFormLogin(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "Login";
    }

    @PostMapping("/Login")
    public String Login(@ModelAttribute Usuario c,
                        HttpServletRequest request,
                        Model model) {

        Usuario usuarioBD = UDao.findByNombreAndPassword(c.getNombre(), c.getPassword());

        if (usuarioBD != null) {
            request.getSession().setAttribute("usuarioLogiado", usuarioBD);
            return "Ideas";
        } else {
            model.addAttribute("usuario", new Usuario());
            model.addAttribute("error", true);
            return "Login";
        }
    }

}
