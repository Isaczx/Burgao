package br.com.Burgao.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Usuario> ListaUsuarios = new ArrayList<>();

	static {
		Usuario isac = new Usuario("isacjobz@gmail.com", "12345");
		Usuario teste = new Usuario("teste@gmail.com", "12345");
		
		ListaUsuarios.add(teste);
		ListaUsuarios.add(isac);
		
	}

	public Usuario existeUsuario(String usuario, String senha) {
		for (Usuario u : ListaUsuarios) {
			if (u.testaLogin(usuario, senha)) {
				return u;
				
			}
			
		}
		return null;
	}

}
