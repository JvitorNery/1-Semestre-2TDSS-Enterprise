package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroProjetoGrupoView {

	public static void main(String[] args) {
		//Cadastrar um projeto e um grupo:
		//Obter uma instacia do EntityManager
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager(); 
		
		//Instanciar os DAOs
		GrupoAmDAO grupoDao = new GrupoAmDAOImpl(em);
		ProjetoAmDAO projetoDao = new ProjetoAmDAOImpl(em);

		//Instanciar um grupo e um projeto
		GrupoAm grupo = new GrupoAm(0, "4M");
		
		ProjetoAm projeto = new ProjetoAm(0, "Pet Shop Web", 
				new GregorianCalendar(2017, Calendar.OCTOBER, 10), 0, null);
		
		projeto.setGrupo(grupo);
		
		//Cadastrar utilizando o DAO
		//grupoDao.insert(grupo);
		projetoDao.insert(projeto);
		
		try {
			//Commit
			projetoDao.save();
			//Sucesso!
		} catch (CommitException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0); //Fecha o programa
		}
		
	}
	
}
