package SistemadePonto;

import java.util.ArrayList;

public class Funcionario {
	String nome;
	String matricula;
	String senha;

	public Funcionario(String nome, String matricula, String senha) {
		this.nome = nome;
		this.matricula = matricula;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
