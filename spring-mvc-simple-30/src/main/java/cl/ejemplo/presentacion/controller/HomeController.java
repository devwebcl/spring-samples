package cl.ejemplo.presentacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.ejemplo.presentacion.service.IEjemploService;

import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class HomeController {

    @Autowired
    private IEjemploService ejemploService;


	@RequestMapping("/")
	public String welcome(Model model) throws Exception  { // throws PlataformaBaseException {

		model.addAttribute("greeting", "Hola Mundo !");
		model.addAttribute("tagline", "springmvc...");

		//some dummy impl
		String dummy = ejemploService.getBienvenida("welcome");


		return "welcome";
	}
}

