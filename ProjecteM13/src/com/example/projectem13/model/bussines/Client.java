
package com.example.projectem13.model.bussines;

import java.io.Serializable;
import java.util.Date;

public class Client implements Serializable {
	private int id;
	private int idAgent;
	private String adreca;
	private String poblacio;
	private String nif;
	private String cp;
	private float longitud;
	private float latitud;
	private Date proximaVisita;
	
	public Client(){}
	
	

	public Client(int id, int idAgent, String adreca, String poblacio,
			String nif, String cp, float longitud, float latitud,
			Date proximaVisita) {
		super();
		this.id = id;
		this.idAgent = idAgent;
		this.adreca = adreca;
		this.poblacio = poblacio;
		this.nif = nif;
		this.cp = cp;
		this.longitud = longitud;
		this.latitud = latitud;
		this.proximaVisita = proximaVisita;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public String getAdreca() {
		return adreca;
	}

	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}

	public String getPoblacio() {
		return poblacio;
	}

	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}



	public float getLongitud() {
		return longitud;
	}



	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}



	public float getLatitud() {
		return latitud;
	}



	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}



	public Date getProximaVisita() {
		return proximaVisita;
	}



	public void setProximaVisita(Date proximaVisita) {
		this.proximaVisita = proximaVisita;
	}
	
}
