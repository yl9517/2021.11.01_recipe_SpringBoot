package com.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("page","main.html");
		return "view";
	}
	
	@GetMapping("/header")
	public String main() {
		return "header";
	}
	
}
