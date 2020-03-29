/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.proyectoPanal.controlador;

import com.ufro.proyectoPanal.DAO.IdeasDAO;
import com.ufro.proyectoPanal.modelo.Ideas;
import com.ufro.proyectoPanal.modelo.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IdeasController {

    @Autowired
    private IdeasDAO iDao;

    @GetMapping("/Ideas")
    public String Ideas(Model model) {
        List<Ideas> ideas = iDao.findAll();

        model.addAttribute("IdeasCreadas", ideas);

        return "Ideas";
    }

    @GetMapping("/Ideas/AgregarIdeas")
    public String crearIdeas(Model model) {

        model.addAttribute("IdeasCreadas", new Ideas());

        return "AgregarIdeas";

    }

    @PostMapping("/Ideas/AgregarIdeas")
    public String crearIdeas(@ModelAttribute Ideas e) {

        iDao.save(e);

        return "Ideas";
    }

    @GetMapping("/{tema}/Arte")
    public String temaIdeas(@PathVariable(name = "tema") String tema,
            Model model
    ) {
        List<Ideas> e = iDao.findByTema(tema);
        // Ideas e = iDao.findByTema(tema);

        model.addAttribute("Temas", e);

        return "Arte";
    }

    @GetMapping("/{tema}/Deporte")
    public String temaIdeas2(@PathVariable(name = "tema") String tema,
            Model model
    ) {
        List<Ideas> e = iDao.findByTema(tema);
        // Ideas e = iDao.findByTema(tema);

        model.addAttribute("Temas", e);

        return "Deporte";
    }

    @GetMapping("/{tema}/Ciencia")
    public String temaIdeas3(@PathVariable(name = "tema") String tema,
            Model model
    ) {
        List<Ideas> e = iDao.findByTema(tema);
        // Ideas e = iDao.findByTema(tema);

        model.addAttribute("Temas", e);

        return "Ciencia";
    }

    @GetMapping("/{tema}/Cultura")
    public String temaIdeas4(@PathVariable(name = "tema") String tema,
            Model model
    ) {
        List<Ideas> e = iDao.findByTema(tema);
        // Ideas e = iDao.findByTema(tema);

        model.addAttribute("Temas", e);

        return "Cultura";
    }

    @GetMapping("/{tema}/Medicina")
    public String temaIdeas5(@PathVariable(name = "tema") String tema,
            Model model
    ) {
        List<Ideas> e = iDao.findByTema(tema);
        // Ideas e = iDao.findByTema(tema);

        model.addAttribute("Temas", e);

        return "Medicina";
    }

    
    @GetMapping("/Ideas/{id}")
    public String eliminar(@PathVariable(name = "id") int id , Model model){
      Ideas eliminar = iDao.deleteById(id);
        model.addAttribute("Eliminar", eliminar);
        return "Ideas";
    }
    @GetMapping("/Actualizar/{id}")
    public String actualizar(@PathVariable(name = "id") int id, Model model) {
        Ideas actualizar = iDao.findById(id);
        model.addAttribute("actualizar", actualizar);
        return "Actualizar";
    }
 @PostMapping("/Actualizar")
    public String ActualizarIdeas(@ModelAttribute Ideas e) {

        iDao.save(e);

        return "Ideas";
    }

}
