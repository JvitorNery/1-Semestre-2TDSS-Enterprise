package br.com.fiap.revisao.bean;

import java.util.Calendar;

public class Pessoa {

	private String nome;
	
	private Calendar dataNascimento;
	
	private Sexo sexo;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, Calendar dataNascimento, Sexo sexo) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}