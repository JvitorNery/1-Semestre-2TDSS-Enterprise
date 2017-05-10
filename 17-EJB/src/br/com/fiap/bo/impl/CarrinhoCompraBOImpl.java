package br.com.fiap.bo.impl;

import javax.ejb.Stateful;
import br.com.fiap.bo.CarrinhoCompraBO;

@Stateful
public class CarrinhoCompraBOImpl implements CarrinhoCompraBO{

	private double totalBitcoin;
	
	@Override
	public double adicionarBitCoin(double bitcoin) {
		return totalBitcoin += bitcoin;
	}

}