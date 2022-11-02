package com.devops.HealthyLife.controllers;


import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devops.HealthyLife.modeles.Dessert;
import com.devops.HealthyLife.modeles.Entree;
import com.devops.HealthyLife.modeles.Plat;
import com.devops.HealthyLife.modeles.Repas;


@Controller
public class PagesController {
	
	Entree soupe = new Entree("soupe");
	Plat dinde = new Plat("dinde");
	Dessert rien = new Dessert("tiramisu");
	Repas r = new Repas(soupe,dinde,rien,"12:00","01-11-2022","petit dej");
	
	@GetMapping("/")
	@ResponseBody
	public String home() throws SQLException {
		ArrayList<String> repas=r.lister_repas();
		r.setRepas();
		String toreturn = "";		
		for (int i=0;i<repas.size();i++) {
			toreturn+=" "+repas.get(i);
		}
		return toreturn;
		
	}

}
