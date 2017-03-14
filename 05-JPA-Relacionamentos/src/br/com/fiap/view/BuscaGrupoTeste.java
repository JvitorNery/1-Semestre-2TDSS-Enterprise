package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class BuscaGrupoTeste {

	public static void main(String[] args) {
		//Buscar um grupo e exibir o nome do grupo e do projeto
		//Obter um EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance()
				.createEntityManager();
		
		//Instanciar um DAO (Grupo)
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		
		//Buscar um grupo de código 1
		GrupoAm grupo = dao.findById(1);
		
		//Exibir o nome do grupo e do projeto
		System.out.println(grupo.getNome());
		System.out.println(grupo.getProjeto().getNome());
		
		//Sucesso!
		em.close();
		System.exit(0);
	}
	
}
