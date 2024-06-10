package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListadoDocentes;
import ar.edu.unju.fi.model.Docente;


@Controller
public class DocenteController {
	
	@GetMapping("/formularioDocente")
	public ModelAndView getFormDocente() {
		ModelAndView modelView = new ModelAndView("formDocente");
		modelView.addObject("nuevoDocente", new Docente());
		
		ListadoDocentes.agregarDocente(new Docente());
		return modelView;
	}
}