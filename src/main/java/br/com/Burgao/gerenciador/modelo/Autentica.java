package br.com.Burgao.gerenciador.modelo;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Autentica implements Endereco {
	
	public String Logar(HttpServletRequest request, HttpServletResponse response) {
		
		Usuario isac = new Usuario("isacjobz@gmail.com", "123");
		
		String usuario = request.getParameter("username");
		String senha = request.getParameter("password");	
		
		Banco banco = new Banco();
		Usuario usuari = banco.existeUsuario(usuario, senha);
		
		if (usuari != null) {
			System.out.println("login realizado com sucesso");
			
			return "forward:NewFile.html";
			
		}else {
			System.out.println("Usuario ou senha incorreta");		
			return "redirect:index.html";
		}
	}

}
