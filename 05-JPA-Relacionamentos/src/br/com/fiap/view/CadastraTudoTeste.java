package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.Professor;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastraTudoTeste {

	public static void main(String[] args) {
		//Cadastrar tudo!
		//EntityManager
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		//GrupoDAO
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		//Instanciar a galera!
		GrupoAm grupo = new GrupoAm(0, "Natura4ever");
		ProjetoAm projeto = new ProjetoAm(0, 
			"Natureba Digital", 
			new GregorianCalendar(2017, Calendar.OCTOBER, 20), 
			10, "Projeto disruptivo");
		
		grupo.setProjeto(projeto);
		//é preciso "setar" o atributo sem o mappedBy
		//para cadastrar a FK
		projeto.setGrupo(grupo);
		
		grupo.addAluno(new Aluno("Lucas"));
		grupo.addAluno(new Aluno("Cirilo"));
		grupo.addAluno(new Aluno("Maria Joaquina"));
		grupo.addAluno(new Aluno("Helena"));
		
		List<Professor> professores = new ArrayList<>();
		professores.add(new Professor("Humberto"
			,new GregorianCalendar(2012, Calendar.JANUARY, 1)));
		professores.add(new Professor("Elisa"
			,new GregorianCalendar(2010, Calendar.JANUARY, 1)));
		professores.add(new Professor("Rita"
			,new GregorianCalendar(1996, Calendar.JANUARY, 1)));
		
		//Adiciona os professores no aluno
		for (Aluno aluno : grupo.getAlunos()) {
			aluno.setProfessores(professores);
		}
	
		try {
			dao.insert(grupo);
			dao.save();
		} catch (CommitException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
		
	}
	
}
