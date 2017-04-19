package br.com.fiap.view;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemPedidoDAO;
import br.com.fiap.dao.impl.ItemPedidoDAOImpl;
import br.com.fiap.entity.ItemPedido;
import br.com.fiap.entity.Pedido;
import br.com.fiap.entity.Produto;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class ConsoleView {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		Pedido pedido = new Pedido("Thiago", Calendar.getInstance());
		Produto produto = new Produto("Pastel",5);
		ItemPedido item = new ItemPedido(produto,pedido,2);
		
		ItemPedidoDAO dao = new ItemPedidoDAOImpl(em);
		
		try {
			dao.insert(item);
			dao.save();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}
