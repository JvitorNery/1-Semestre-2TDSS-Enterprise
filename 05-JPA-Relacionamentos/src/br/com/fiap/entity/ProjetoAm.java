package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="TB_PROJETO_AM")
@SequenceGenerator(name="seqProjeto",
sequenceName="SQ_TB_PROJETO_AM",allocationSize=1)
public class ProjetoAm {

	@Id
	@Column(name="CD_PROJETO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="seqProjeto")
	private int codigo;
	
	@Column(name="NM_PROJETO",nullable=false,length=100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ENTREGA",nullable=false)
	private Calendar dataEntrega;
	
	@Column(name="VL_NOTA")
	private float nota;
	
	@Column(name="DS_OBSERVACAO")
	private String observacoes;
	
	//cascade -> replica a ação da entidade no relacionamento
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="FK_CD_GRUPO")
	private GrupoAm grupo;

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

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public ProjetoAm() {
		super();
	}

	public ProjetoAm(int codigo, String nome, Calendar dataEntrega, float nota, String observacoes) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataEntrega = dataEntrega;
		this.nota = nota;
		this.observacoes = observacoes;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public GrupoAm getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAm grupo) {
		this.grupo = grupo;
	}
	
}
