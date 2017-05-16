package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface EnqueteBO {

	void votarEnterprise();
	void votarDigital();
	
	int apurarEnterprise();
	int apurarDigital();
	
}