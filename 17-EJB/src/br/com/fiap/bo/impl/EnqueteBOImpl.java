package br.com.fiap.bo.impl;

import javax.ejb.Singleton;
import br.com.fiap.bo.EnqueteBO;

@Singleton
public class EnqueteBOImpl implements EnqueteBO {

	private int enterprise, digital;
	
	@Override
	public void votarEnterprise() {
		enterprise++;
	}

	@Override
	public void votarDigital() {
		digital++;
	}

	@Override
	public int apurarEnterprise() {
		return enterprise;
	}

	@Override
	public int apurarDigital() {
		return digital;
	}

}
