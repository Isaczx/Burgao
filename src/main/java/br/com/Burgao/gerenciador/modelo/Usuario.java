package br.com.Burgao.gerenciador.modelo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String usuario;
	private Integer cpf;
	private String senha;
	private Image foto;
	private Object funcao;

	public Usuario(String usuario, String string) {
		this.usuario = usuario;
		this.senha = string;
	}

	private void CriarUsuario(String usuario, String senha) {
		Usuario u = new Usuario(this.usuario, this.senha);

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

	public Object getFuncao() {
		return funcao;
	}

	public void setFuncao(Object funcao) {
		this.funcao = funcao;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public boolean testaLogin(String usuario, String senha) {
		if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;

		}else {
			return false;
		}
	}
	

}
