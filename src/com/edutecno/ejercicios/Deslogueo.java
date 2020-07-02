package com.edutecno.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class Deslogueo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// Se crea variable de sesion y se recibe desde el request
		HttpSession sesion = request.getSession();
		PrintWriter out = response.getWriter();
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Ha cerrado sesion correctamente');");
		out.println("</script>");
		// el m�dito invalidate destruye la sesion
		sesion.invalidate();
		// el metodo sendRedirect redirige al formulario de ingreso
		response.sendRedirect("index.jsp");
		return;
	}
}
