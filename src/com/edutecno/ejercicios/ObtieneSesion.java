package com.edutecno.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.edutecno.ejercicios.model.EntradaConcierto;

@WebServlet("/obtieneSesion")
public class ObtieneSesion extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession misesion = request.getSession();
		EntradaConcierto entradas = (EntradaConcierto) misesion.getAttribute("datosCompra");
		PrintWriter writer = response.getWriter();
		writer.println("<html><body>");
		writer.println("<h1>Entradas para " + entradas.getNombreArtista() + "</h1>");
		writer.println("<h1>A nombre de " + entradas.getTitularEntrada() + "</h1>");
		writer.println("<h3>Valor $" + entradas.getValor() + "</h3>");
		writer.println("<h2>Nro Asiento : " + entradas.getNroAsiento() + "</h2>");
		writer.println("</body></html>");
	}
}