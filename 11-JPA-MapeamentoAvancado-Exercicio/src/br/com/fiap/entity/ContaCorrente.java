package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_CORRENTE")
public class ContaCorrente extends Conta{

	@Column(name="VL_TARIFA",nullable=false)
	private double tarifa;
	
	@Column(name="VL_CHEQUE_ESPECIAL")
	private double limite;

	public ContaCorrente(Agencia agencia, double saldo, double tarifa, double limite) {
		super(agencia, saldo);
		this.tarifa = tarifa;
		this.limite = limite;
	}

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
