package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_GRUPO_AM")
@SequenceGenerator(name="seqGrupo",
sequenceName="SQ_TB_GRUPO_AM",allocationSize=1)
public class GrupoAm {

	@Id
	@Column(name="CD_GRUPO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="seqGrupo")
	private int codigo;
	
	@Column(name="NM_GRUPO",nullable=false,length=50)
	private String nome;

	public GrupoAm() {
		super();
	}

	public GrupoAm(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
