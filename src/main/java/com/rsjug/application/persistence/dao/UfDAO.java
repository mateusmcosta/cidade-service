package com.rsjug.application.persistence.dao;


import com.rsjug.application.persistence.entity.Uf;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class UfDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Uf> buscaTodos() {
		return entityManager.createQuery("select e from Uf e order by e.id desc", Uf.class).getResultList();
	}

	public void create(String sigla, String nome) {
	 	entityManager.persist(new Uf(sigla, nome));
	}
}
