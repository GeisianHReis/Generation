package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")
public class InicioAplicacao {
	
		@GetMapping
		public String objetivos() {
			String objetivo = "Entender o spring, e conseguir fazer aplicações praticas.";
			
			return objetivo;
		}
}

