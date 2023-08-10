package br.com.sakila.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActorController {
	
	@GetMapping("/atores/atores")
	public String home()
	{
		return "atores/atores";
	}

}
