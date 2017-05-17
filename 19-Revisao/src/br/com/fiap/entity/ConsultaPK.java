package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

public class ConsultaPK implements Serializable {

	private Calendar data;
	
	private int medico;
	
	private int paciente;

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getMedico() {
		return medico;
	}

	public void setMedico(int medico) {
		this.medico = medico;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	
}
