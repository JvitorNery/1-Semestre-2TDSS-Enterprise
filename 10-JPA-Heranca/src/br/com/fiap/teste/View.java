package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.entity.Sexo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class View {

	public static void main(String[] args) {
		//Cadastrar uma pessoa fisica
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		PessoaFisica pf = 
			new PessoaFisica("Lucas", "Av Lins", "113213131", Sexo.MASCULINO);
		
		PessoaJuridica pj =	new PessoaJuridica(
			"Coca Cola", "Av da alegria", "13213213546646/0001-45", "Saúde");
		
		try {
			dao.insert(pf);
			dao.insert(pj);
			dao.save();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}
