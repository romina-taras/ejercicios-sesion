package com.edutecno.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edutecno.ejercicios.model.EntradaConcierto;

@WebServlet("/creaSesion")
public class EjemploSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String usuario = request.getParameter("nombre");
		String nroAsiento = String.valueOf(Math.random()*1000+1); //entrada nro aliatorio
		EntradaConcierto entrada = new EntradaConcierto();
		HttpSession sesion = request.getSession(true);
		PrintWriter writer = response.getWriter();
		entrada.setNombreArtista("Iron Maiden");
		entrada.setFechaConcierto(new Date());
		entrada.setUbicacion("Cancha");
		entrada.setTitularEntrada(usuario);
		entrada.setNroAsiento(nroAsiento);
		sesion.setAttribute("datosCompra", entrada);
		writer.println("<html><body>");
		writer.println("<h1>Entradas para " + entrada.getNombreArtista() + "</h1>");
		writer.println("<h1>A nombre de " + entrada.getTitularEntrada() + "</h1>");
		writer.println("<h2>Nro Asiento :" + entrada.getNroAsiento()+"</h2>");
		writer.println("</body></html>");
	}
}
