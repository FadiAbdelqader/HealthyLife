package com.devops.HealthyLife.modeles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.devops.HealthyLife.controllers.BDController;

public  class ComposantRepas {
	protected int calories;
	protected String nom;
	private String className;
	
	
	public ComposantRepas() {
		this.className = getClass().getSimpleName();
	} // à utiliser pour consulter liste entrees/plats/desserts/collations
	
	public ComposantRepas(String nom) {
		this.nom = nom;
		this.className = getClass().getSimpleName();
	}
	
	public  ArrayList<String> lister_composants() throws SQLException{
		ArrayList<String> liste = new ArrayList<String>();
		ResultSet res = BDController.executeStatement(String.format("SELECT nom FROM %s;",className));
		while(res.next()) {
			liste.add(res.getString("nom"));
		}
		return liste;
	}
	
	
	public int getCalories() throws SQLException {
		ResultSet res = BDController.executeStatement(String.format("SELECT calories FROM %s where nom = '%s';",className,nom));
		res.next();
		return res.getInt("calories");
	}
	
	
	public void rajouter_composant(String nom, int calories) throws SQLException {
		BDController.executeStatement(String.format("INSERT INTO %s(nom,calories) VALUES('%s',%d);",className,nom,calories));
	}
	
	
	public int getID() throws SQLException {
		ResultSet res = BDController.executeStatement(String.format("SELECT id FROM %s where nom = '%s'",className,this.nom));
		res.next();
		return res.getInt("id");

	}
	
}
