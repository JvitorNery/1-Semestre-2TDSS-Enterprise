package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroGrupoAlunoTeste {

	public static void main(String[] args) {
		//Cadastrar alunos e grupo:
		//Instanciar o EntityManager
		EntityManager em = EntityManagerFactorySingleton
									.getInstance().createEntityManager();
		//Instanciar o GrupoDAO
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		//Instanciar um Grupo 
		GrupoAm grupo = new GrupoAm(0,"KJRGT KLB");
		
		//Cria o aluno e adiciona no grupo
		grupo.addAluno(new Aluno("Gilcier"));
		grupo.addAluno(new Aluno("Ricardo"));
		
		try{
			//Persistir e sucesso!
			dao.insert(grupo); //Os alunos serão cadastrados em cascata
			dao.save();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
		
	}
	
}
