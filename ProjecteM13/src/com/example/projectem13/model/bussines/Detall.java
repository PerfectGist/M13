package com.example.projectem13.model.bussines;

public class Detall {
	private int id;
	private int idComanda;
	private int idProducte;
	private int idAgent;
	private int quantitat;
	public Detall(int id, int idComanda, int idProducte, int idAgent, int quanti) {
		super();
		this.id = id;
		this.idComanda = idComanda;
		this.idProducte = idProducte;
		this.idAgent = idAgent;
		this.quantitat = quantitat;
	};
	public Detall(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdComanda() {
		return idComanda;
	}
	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}
	public int getIdProducte() {
		return idProducte;
	}
	public void setIdProducte(int idProducte) {
		this.idProducte = idProducte;
	}
	public int getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	public int getQuantitat() {
		return quantitat;
	}
	public void setQuantitat(int quantitat) {
		this.quantitat = quantitat;
	}
	
		
}
