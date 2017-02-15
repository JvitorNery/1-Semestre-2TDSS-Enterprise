package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Sexo;

public class TesteAtualizacao {

	public static void main(String[] args) {
		//EntityManager
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar o funcionário
		Funcionario func = em.find(Funcionario.class, 1);
		
		//Alterar os valores do funcionário
		func.setNome("Leticia");
		func.setSexo(Sexo.FEMININO);
		
		//Atualizar um funcionário
		em.merge(func);
		
		//Transação
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Funcionário atualizado!");
		System.exit(0);
		
		
	}

}
