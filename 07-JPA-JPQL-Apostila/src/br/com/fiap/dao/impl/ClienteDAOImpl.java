package br.com.fiap.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> buscarPorEstado(String estado) {
		TypedQuery<Cliente> query = em.createQuery(
			"from Cliente c where c.endereco.cidade.uf = :es",Cliente.class);
		query.setParameter("es", estado);
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorDiaReserva(int numero) {
		TypedQuery<Cliente> query = em.createQuery(
			"select r.cliente from Reserva r "
			+ "where r.numeroDias = :n",Cliente.class);
		query.setParameter("n", numero);
		query.setMaxResults(50); //Retorna no m�ximo 50 registros
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscar(String nome, String cidade) {
		return em.createQuery("from Cliente c where c.nome like "
			+ ":n and c.endereco.cidade.nome like :c",Cliente.class)
			.setParameter("n", "%" + nome + "%")
			.setParameter("c", "%" + cidade + "%")
			.getResultList();
	}

	@Override
	public List<Cliente> buscarPorEstados(Collection<String> estados) {
		return em.createQuery("from Cliente c where "
				+ "c.endereco.cidade.uf in :estados",Cliente.class)
				.setParameter("estados", estados)
				.getResultList();
	}

}







