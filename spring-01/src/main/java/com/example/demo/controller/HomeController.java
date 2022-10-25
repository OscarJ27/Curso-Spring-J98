package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Personaje;

@Controller
@RequestMapping("/app")
public class HomeController {
	
	@Value("${title.generic}")
	private String titlePage;
	
	@GetMapping({"/home","/inicio","/","/Home","/Inicio"})
	public String HolaMundo(Model model) {
		
		Personaje personaje1 = new Personaje();
		personaje1.setNombres("Luffy");
		personaje1.setAlias("Luffy Alias");
		personaje1.setTipoFruta("Luffy TipoFruta");
		personaje1.setHabilidad("Luffy Habilidad");
		personaje1.setTripulacion("Luffy Tripulacion");
		personaje1.setRecompensa("123456789");
		
		List<Personaje> listita = new ArrayList<>();
		
		Personaje personaje2 = new Personaje();
		personaje2.setNombres("Luffy 2");
		personaje2.setAlias("Luffy Alias 2");
		personaje2.setTipoFruta("Luffy TipoFruta 2");
		personaje2.setHabilidad("Luffy Habilidad 2");
		personaje2.setTripulacion("Luffy Tripulacion 2");
		personaje2.setRecompensa("123456789 2");
		
		
		listita.add(personaje1);
		listita.add(personaje2);
		
		
		
		
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("titulo", "Seccion J98 - Demo Listado");
		model.addAttribute("listita", listita);
		return "Home";
	}
}
