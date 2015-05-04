package com.example.projectem13.model.bussines;

public class AgentComercial {
	private int id;
	private String username;
	private String pass;
	private String nom;
	private String cognoms;
	private String mail;
	private String imatge;
	public AgentComercial(int id, String username, String pass, String nom,
			String cognoms, String mail, String imatge) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.nom = nom;
		this.cognoms = cognoms;
		this.mail = mail;
		this.imatge = imatge;
	}
	public AgentComercial(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getImatge() {
		return imatge;
	}
	public void setImatge(String imatge) {
		this.imatge = imatge;
	}
	
	
	
	
}
