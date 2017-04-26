package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	@Column(name="NR_CNPJ")
	private String cnpj;
	
	@Column(name="DS_RAMO_ATIVIDADE")
	private String ramoAtividade;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, String endereco, String cnpj, String ramoAtividade) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.ramoAtividade = ramoAtividade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}
	
}
