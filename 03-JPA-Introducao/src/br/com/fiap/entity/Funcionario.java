package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id
	private int codigo;
	
	private String nome;
	
	private Calendar dataNascimento;
	
	private Calendar dataAdmissao;
	
}
