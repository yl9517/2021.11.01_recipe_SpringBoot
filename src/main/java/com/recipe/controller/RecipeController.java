package com.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {

	@GetMapping("/recipe")
	public String recipeList(Model model) {
		model.addAttribute("page","recipeList.html");
		return "view";
	}
	
	@GetMapping("/oneRecipe")
	public String oneRecipe(Model model) {
		model.addAttribute("page","oneRecipe.html");
		return "view";
	}
	
	@GetMapping("/recipeWrite")
	public String recipeWrite(Model model) {
		model.addAttribute("page","recipeWrite.html");
		return "view";
	}
	
}
