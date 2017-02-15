package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		//Criar o gerenciador de entidades
		
		//Criar a fabrica de entity manager
		EntityManagerFactory fabrica = //valor configurado no persistence.xml
			Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		
		
	}
	
}
