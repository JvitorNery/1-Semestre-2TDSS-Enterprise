package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MEDICO")
@SequenceGenerator(name="seqMedico",sequenceName="SQ_T_MEDICO",allocationSize=1)
public class Medico {

	@Id
	@Column(name="CD_MEDICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqMedico")
	private int codigo;
	
	@Column(name="NM_MEDICO",nullable=false,length=100)
	private String nome;
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;
	
	public Medico(String nome, byte[] foto, Calendar dataNascimento, Sexo sexo) {
		super();
		this.nome = nome;
		this.foto = foto;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	public Medico() {
		super();
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

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
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
