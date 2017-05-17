package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PACIENTE")
@SequenceGenerator(name="seqPac",sequenceName="SQ_T_PACIENTE",allocationSize=1)
public class Paciente {

	@Id
	@Column(name="CD_PACIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqPac")
	private int codigo;
	
	@Column(name="NM_PACIENTE",nullable=false,length=100)
	private String nome;
	
	@OneToMany(mappedBy="paciente")
	private List<Consulta> consultas;

	public Paciente() {
		super();
	}

	public Paciente(String nome) {
		super();
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

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}
	
}
