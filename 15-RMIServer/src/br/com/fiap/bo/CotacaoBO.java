package br.com.fiap.bo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CotacaoBO extends Remote{

	double converterBitCoinParaReal(double bitcoin)
									throws RemoteException;
	
}