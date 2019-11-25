package com.dasilva.pizza.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpizzaController {
	
	public SpizzaController() {

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "index";
	}

}
