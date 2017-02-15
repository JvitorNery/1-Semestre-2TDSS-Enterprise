package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;

public class TesteBusca {

	public static void main(String[] args) {
		//EntityManager
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar o funcionário                código do funcionario
		Funcionario func = em.find(Funcionario.class, 1);
		
		em.close();
		
		System.out.println("Funcionário: " + func.getNome());
		System.exit(0); //Parar a aplicação
	}
}
