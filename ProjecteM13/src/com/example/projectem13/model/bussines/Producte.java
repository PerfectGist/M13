package com.example.projectem13.model.bussines;

public class Producte {
	private int id;
	private int idCategoria;
	private String nom;
	private float preu;
	private String descripcio;
	private String imatge;
	public Producte(int id, int idCategoria, String nom, float preu,
			String descripcio, String imatge) {
		super();
		this.id = id;
		this.idCategoria = idCategoria;
		this.nom = nom;
		this.preu = preu;
		this.descripcio = descripcio;
		this.imatge = imatge;
	}
	
	public Producte(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public String getImatge() {
		return imatge;
	}

	public void setImatge(String imatge) {
		this.imatge = imatge;
	}
	
	
}
