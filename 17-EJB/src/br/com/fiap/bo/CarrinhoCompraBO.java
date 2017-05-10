package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface CarrinhoCompraBO {

	double adicionarBitCoin(double bitcoin);
	
}
