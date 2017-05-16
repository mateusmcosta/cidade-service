package com.rsjug.application.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.rsjug.application.persistence.dao.UfDAO;
import com.rsjug.application.persistence.entity.Uf;


@Stateless
public class UfService {
	
	@Inject
	private UfDAO ufDAO;
	
	public List<Uf> buscaTodos() {
		return ufDAO.buscaTodos();
	}
}
