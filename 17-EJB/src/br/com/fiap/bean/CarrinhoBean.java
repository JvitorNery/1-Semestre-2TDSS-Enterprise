package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoCompraBO;

@ManagedBean
@SessionScoped
public class CarrinhoBean {

	private double valor, total;
	
	@EJB
	private CarrinhoCompraBO bo;
	
	public void adicionar(){
		total = bo.adicionarBitCoin(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
