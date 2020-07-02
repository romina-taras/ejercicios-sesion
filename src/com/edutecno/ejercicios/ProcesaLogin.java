package com.edutecno.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/procesaLogin")
public class ProcesaLogin extends HttpServlet {
	private final String LOGIN = "UsuarioRegistrado";
	private final String PASS = "admin";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String requestLogin = "";
		String requestPass = "";
		// Generamos variable writer para crear código HTML
		PrintWriter writer = response.getWriter();
		// Obtenemos valores del request desde el formulario
		requestLogin = request.getParameter("login");
		requestPass = request.getParameter("pass");
		// Comparamos los valores enviados desde el formulario, si alguno de ellos
		// no coincide, generamos una alerta con un mensaje, mediante la variable out
		if (!LOGIN.contentEquals(requestLogin) || !PASS.contentEquals(requestPass)) {
			writer.println("<script type=\"text/javascript\">");
			writer.println("alert('Usuario o password incorrecto');");
			writer.println("location='login.jsp';");
			writer.println("</script>");
		} else {
			// creamos la sesion si el usuario existe
			HttpSession sesionUsuario = request.getSession(true);
			sesionUsuario.setAttribute("Nombre", requestLogin);
			RequestDispatcher rd = request.getRequestDispatcher("areaPrivada.jsp");
			rd.forward(request, response);
		}
	}
}