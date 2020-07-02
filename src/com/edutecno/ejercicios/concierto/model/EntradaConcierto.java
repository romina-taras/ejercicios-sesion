package com.edutecno.ejercicios.concierto.model;

import java.util.Date;

public class EntradaConcierto {

	private String titularEntrada;
	private String nombreArtista;
	private String ubicacion;
	private Date fechaConcierto;
	private String correo;
	private double precio;
    private int valor;

	private String nombreConcierto;
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}


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
	
	public String getNombreConcierto() {
		return nombreConcierto;
	}

	public void setNombreConcierto(String nombreConcierto) {
		this.nombreConcierto = nombreConcierto;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
