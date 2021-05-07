package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.UserForm;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("/")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/ex04receive")
	public String ex04receive(@Validated UserForm userForm, BindingResult result) {
		if(result.hasErrors()) {
			return "/exam04";
		}
		return "exam04-result";
	}
	
	
}
