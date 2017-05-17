package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(ConsultaPK.class)
@Table(name="T_CONSULTA")
public class Consulta {

	@Id
	@Column(name="DT_CONSULTA")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	@Id
	@JoinColumn(name="CD_PACIENTE")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Paciente paciente;
	
	@Id
	@ManyToOne
	@JoinColumn(name="CD_MEDICO")
	private Medico medico;
	
	@Column(name="DS_SINTOMA",nullable=false,length=855)
	private String sintoma;

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	
}
