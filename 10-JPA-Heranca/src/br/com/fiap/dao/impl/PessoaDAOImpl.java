package br.com.fiap.dao.impl;

import br.com.fiap.entity.Pessoa;
import javax.persistence.EntityManager;
import br.com.fiap.dao.PessoaDAO;

public class PessoaDAOImpl extends GenericDAOImpl<Pessoa, Integer>
										implements PessoaDAO{

	public PessoaDAOImpl(EntityManager em) {
		super(em);
	}

}
