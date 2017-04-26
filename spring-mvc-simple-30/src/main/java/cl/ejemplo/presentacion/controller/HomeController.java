package cl.ejemplo.presentacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.ejemplo.presentacion.service.IEjemploService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
// import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;


@Controller
public class HomeController {

    @Autowired
    private IEjemploService ejemploService;

    @Value("${test.scheduled}")
    private String str;

    @Value("${test.hola}")
    private String salute;

    @Value("${test.externo}")
    private String externo;


	@RequestMapping("/")
	public String welcome(Model model) throws Exception  { // throws PlataformaBaseException {

		model.addAttribute("greeting", "Hola " + salute );
		model.addAttribute("tagline", "springmvc... " + str);
		model.addAttribute("meves", "me ves? " + externo);


		//some dummy impl
		String dummy = ejemploService.getBienvenida("welcome");
		System.out.println(dummy);


		return "welcome";
	}



}

