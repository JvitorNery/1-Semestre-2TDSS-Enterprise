package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_JOGADOR")
@SequenceGenerator(name="seqJogador",sequenceName="SQ_TB_JOGADOR",allocationSize=1)
public class Jogador {

	@Id
	@Column(name="CD_JOGADOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqJogador")
	private int codigo;
	
	@Column(name="NM_JOGADOR",nullable=false,length=100)
	private String nome;
	
	@Column(name="NR_JOGADOR")
	private int numero;
	
	@Column(name="VL_ALTURA")
	private float altura;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;
	
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	public Jogador() {
		super();
	}

	public Jogador(int codigo, String nome, int numero, float altura, Sexo sexo, Calendar dataNascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.numero = numero;
		this.altura = altura;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
