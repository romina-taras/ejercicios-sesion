package com.edutecno.ejercicios.model;

import java.util.Date;

public class EntradaConcierto {

	private String titularEntrada;
	private String nombreArtista;
	private String ubicacion;
	private Date fechaConcierto;
	private String nroAsiento;

	public String getTitularEntrada() {
		return titularEntrada;
	}

	public void setTitularEntrada(String titularEntrada) {
		this.titularEntrada = titularEntrada;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFechaConcierto() {
		return fechaConcierto;
	}

	public void setFechaConcierto(Date fechaConcierto) {
		this.fechaConcierto = fechaConcierto;
	}
	
	public String getNroAsiento() {
		return nroAsiento;
	}
	
	public void setNroAsiento(String nroAsiento) {
		this.nroAsiento = nroAsiento;
	}
}
