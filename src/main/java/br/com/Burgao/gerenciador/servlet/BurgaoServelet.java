package br.com.Burgao.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class BurgaoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Usuario usuario = new Usuario("isac@gmail.com" , 174 , 123 );
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		System.out.println(username);
		System.out.println(password);
		
		
		response.sendRedirect("index.html");
	}

	

}
