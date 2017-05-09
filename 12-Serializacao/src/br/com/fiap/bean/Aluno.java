package br.com.fiap.bean;

import java.io.Serializable;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 147310082958373185L;

	private String nome;
	
	private String rm;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String rm) {
		super();
		this.nome = nome;
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}
	
}