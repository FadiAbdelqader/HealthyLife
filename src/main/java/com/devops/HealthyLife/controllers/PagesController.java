package com.devops.HealthyLife.controllers;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PagesController {
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "hello world";
	}
=======

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.devops.HealthyLife.modeles.Dessert;
import com.devops.HealthyLife.modeles.Entree;
import com.devops.HealthyLife.modeles.Plat;
import com.devops.HealthyLife.modeles.Repas;
import com.devops.HealthyLife.modeles.Sport;



@Controller
@ResponseBody
public class PagesController {

	
	@RequestMapping("/")
	public String repas() throws SQLException {
	
		return "hello";
	}

>>>>>>> agenda
}
