package com.mac.bry.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mac.bry.mvc.model.Adress;
import com.mac.bry.mvc.model.Person;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMainPage() {
		return "main-page";
	}
	
	@RequestMapping("showForm")
	public String showForm(@ModelAttribute("person") Person person, @ModelAttribute("adress") Adress adress) {
		return "form-page";
	}
}
