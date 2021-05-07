package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("/")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/ex03receive")
	public String ex03receive(Integer price1, Integer price2, Integer price3) {
		application.setAttribute("price1", price1);
		application.setAttribute("price2", price2);
		application.setAttribute("price3", price3);
		
		Integer total = price1 + price2 + price3;
		Integer tax = (price1 + price2 + price3) / 10;
		Integer taxTotal = price1 + price2 + price3 + tax;
		
		application.setAttribute("total", total);
		application.setAttribute("tax", tax);
		application.setAttribute("taxTotal", taxTotal);
		return "exam03-result";
	}

}
