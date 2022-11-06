package com.devops.HealthyLife.modeles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.devops.HealthyLife.controllers.BDController;

public class Repas {
	
	public Collation collation;
	public Entree entree;
	public Plat plat;
	public Dessert dessert;
	public String heure;
	public String date;
	public String nom;
	
	// à utiliser pour les collations
	public Repas(Collation collation, String time, String date, String nom) {
		this.collation = collation;
		this.heure = time;
		this.date = date;
		this.nom = nom;
	}
	
	// à utiliser pour les repas
	public Repas(Entree e, Plat p, Dessert dessert, String time, String d, String nom) {
		this.entree = e;
		this.plat = p;
		this.dessert = dessert;
		this.heure = time;
		this.date = d;
		this.nom = nom;
	}
	
	public  ArrayList<String> lister_repas() throws SQLException{
		ArrayList<String> liste = new ArrayList<String>();
		ResultSet res = BDController.executeStatement(String.format("SELECT nom_repas FROM repas;"));
		while(res.next()) {
			liste.add(res.getString("nom_repas"));
		}
		return liste;
	}
	
	public  ArrayList<String> lister_collations() throws SQLException{
		ArrayList<String> liste = new ArrayList<String>();
		ResultSet res = BDController.executeStatement(String.format("SELECT nom FROM collation;"));
		while(res.next()) {
			liste.add(res.getString("nom"));
		}
		return liste;
	}
	
	public void setRepas() throws SQLException {
		String sql = String.format(
				"INSERT INTO repas(nom_repas,calories,id_entree,id_plat,id_dessert) "
				+ "VALUES ('%s',%d,%d,%d,%d)",nom, getCaloriesRepas(),entree.getID(),plat.getID(),dessert.getID());
		BDController.executeStatement(sql);
	}
	
	public void setCollation() throws SQLException {
		String sql = String.format("INSERT INTO repas(nom,calories) VALUES ('%s',%d)",nom, collation.getCalories());
		BDController.executeStatement(sql);
	}

	
	public int getCaloriesRepas() throws SQLException {
		return entree.getCalories() + plat.getCalories() + dessert.getCalories();
	}
	
}
