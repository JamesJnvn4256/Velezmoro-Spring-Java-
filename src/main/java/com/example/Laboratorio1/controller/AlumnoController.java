package com.example.Laboratorio1.controller;

import com.example.Laboratorio1.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlumnoController {

    // Muestra el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "formulario"; // El nombre del archivo HTML para el formulario
    }

    // Procesa el formulario y redirige a la página de éxito
    @PostMapping("/exito")
    public String registrarAlumno(@ModelAttribute Alumno alumno, Model model) {
        // Aquí el objeto 'alumno' está lleno con los datos del formulario
        // Ahora puedes agregarlo al modelo para pasarlo a la vista
        model.addAttribute("Alumno", alumno);
        return "exito";  // Retorna la vista 'exito.html'
    }
}
