package br.com.fiap.bo.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.fiap.bo.CotacaoBO;

public class CotacaoBOImpl
					extends UnicastRemoteObject
									implements CotacaoBO {

	public CotacaoBOImpl() throws RemoteException {
		super();
	}

	@Override
	public double converterBitCoinParaReal(double bitcoin)
									throws RemoteException {
		return bitcoin*5627;
	}

}
