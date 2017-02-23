package br.com.fiap.dao;

public interface GenericDAO<T,K> {

	void insert(T entidade);
	void update(T entidade);
	void delete(K id);
	T findById(K id);
	
}