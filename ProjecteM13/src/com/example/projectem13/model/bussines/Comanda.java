package com.example.projectem13.model.bussines;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	private int idL;
	private int idAgent;
	private int idClient;
	private List<Detall> linies;
	public int getIdL() {
		return idL;
	}
	
	
	public Comanda(int idL, int idAgent, int idClient) {
		super();
		this.idL = idL;
		this.idAgent = idAgent;
		this.idClient = idClient;
		this.linies = new ArrayList<Detall>();
	}


	public void setIdL(int idL) {
		this.idL = idL;
	}
	public int getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public List<Detall> getLinies() {
		return linies;
	}
	public void setLinies(List<Detall> linies) {
		this.linies = linies;
	}
	
	
}
