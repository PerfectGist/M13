package com.example.projectem13.model.bussines;

import android.media.Image;

public class ItemDesplegable {
	private boolean esVisible;
	private String titol;
	private Image imatge;
	
	public ItemDesplegable(){}
	
	public ItemDesplegable(boolean esVisible,String titol,Image img){
		this.esVisible = esVisible;
		this.titol = titol;
		this.imatge = img;
	}

	public boolean isEsVisible() {
		return esVisible;
	}

	public void setEsVisible(boolean esVisible) {
		this.esVisible = esVisible;
	}

	public String getTitol() {
		return titol;
	}

	public void setTitol(String titol) {
		this.titol = titol;
	}

	public Image getImatge() {
		return imatge;
	}

	public void setImatge(Image imatge) {
		this.imatge = imatge;
	}
	
}
