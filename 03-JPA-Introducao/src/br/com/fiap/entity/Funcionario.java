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
import javax.persistence.Transient;

@Entity
@Table(name="TB_FUNCIONARIO")
@SequenceGenerator(name="seqFunc",sequenceName="SQ_TB_FUNCIONARIO",allocationSize=1)
public class Funcionario {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqFunc")
	@Column(name="CD_FUNCIONARIO")
	private int codigo;
	
	@Column(name="NM_FUNCIONARIO",nullable=false,length=150)
	private String nome;
	
	@Temporal(TemporalType.DATE) //armazena somente a data
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
	
	@Column(name="DT_ADMISSAO",nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataAdmissao;
	
	@Transient //Não será mapeada para uma coluna no BD
	private int chaveAcesso;
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@Column(name="DS_SEXO")
	private Sexo sexo;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int codigo, String nome, Calendar dataNascimento, Calendar dataAdmissao, int chaveAcesso,
			byte[] foto, Sexo sexo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.dataAdmissao = dataAdmissao;
		this.chaveAcesso = chaveAcesso;
		this.foto = foto;
		this.sexo = sexo;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(int chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}