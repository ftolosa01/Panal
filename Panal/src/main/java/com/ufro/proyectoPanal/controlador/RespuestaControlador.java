/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.proyectoPanal.controlador;

import com.ufro.proyectoPanal.DAO.*;
import com.ufro.proyectoPanal.modelo.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author frnano
 */
@Controller
public class RespuestaControlador {
    
    @Autowired
    private RespuestaDAO rDao;
   
    
    @GetMapping("/Respuesta")
    public String mostrarFormRespuesta(Model model) {
        
        model.addAttribute("Respuesta", new Respuesta());
        
        return "/Respuesta";
    }
    
    @PostMapping("/Respuesta")
    public String CrearRespuesta(@ModelAttribute Respuesta e){
        
        rDao.save(e);
        
        return "Ideas";
    }
    
    @GetMapping("/VerRespuesta")
    public String VerRespeusta(Model model,@ModelAttribute Respuesta c){
        List<Respuesta> respuesta = rDao.findAll();
       
        model.addAttribute("VerRespuesta", respuesta);

        return "/VerRespuesta";
    }
     @GetMapping("/VerRespuesta/{id}")
    public String eliminar(@PathVariable(name = "id") int id , Model model){
      Respuesta eliminar = rDao.deleteById(id);
        model.addAttribute("Eliminar", eliminar);
        return "Ideas";
    }
    
}
