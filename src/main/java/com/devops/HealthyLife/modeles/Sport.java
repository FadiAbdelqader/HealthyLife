package com.devops.HealthyLife.modeles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.devops.HealthyLife.controllers.BDController;

public class Sport {


	private String nom_sport;
	private int calories_brulees;
	
	public Sport(String nom_sport,int calories_brulees) {
		this.nom_sport = nom_sport;
		this.calories_brulees = calories_brulees;
	}
	
	public Sport() {
		
	}
	
	public ArrayList<String> liste_sports() throws SQLException{
		ArrayList<String> liste = new ArrayList<String>();
		ResultSet res = BDController.executeStatement("SELECT nom_sport FROM sport;");
		while(res.next()) {
			liste.add(res.getString("nom_sport"));
		}
		return liste;
	}
	
	public int getCaloriesBrulees() {
		return calories_brulees;
	}
	
	public void rajouter_sport() throws SQLException {
		BDController.executeStatement(String.format("INSERT INTO sport(nom_sport,calories_brulees) VALUES('%s',%d);",nom_sport,calories_brulees));
	}
	
	
	public String getNom_sport() {
		return nom_sport;
	}

	public void setNom_sport(String nom_sport) {
		this.nom_sport = nom_sport;
	}

	public int getCalories_brulees() {
		return calories_brulees;
	}

	public void setCalories_brulees(int calories_brulees) {
		this.calories_brulees = calories_brulees;
	}
	
}
	
