package br.com.Burgao.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.Burgao.gerenciador.modelo.Autentica;
import br.com.Burgao.gerenciador.modelo.Endereco;


public class entradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parametroAcao = request.getParameter("acao");
		
		
		String nomeClasse = "br.com.Burgao.gerenciador.modelo." + parametroAcao;
		String nome;
		
		try {
			
			Class classe = Class.forName(nomeClasse);
			Endereco endereco = (Endereco) classe.newInstance();
			nome = endereco.Logar(request, response);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException();
		}
		
		
		
		
		String[] enderecoP = nome.split(":");
		
		if (enderecoP[0].equals("forward")) {
			RequestDispatcher rd =  request.getRequestDispatcher("WEB-INF/views/" + enderecoP[1]);
			rd.forward(request, response);
			
		}else {
			response.sendRedirect(enderecoP[1]);
		}
		
		
	}

}
