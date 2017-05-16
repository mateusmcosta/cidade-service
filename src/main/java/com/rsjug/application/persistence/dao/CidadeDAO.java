package com.rsjug.application.persistence.dao;

import com.rsjug.application.persistence.entity.Cidade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by mateus on 13/05/17.
 */
public class CidadeDAO {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Cidade> findByUf(String uf) {
        Query query = entityManager.createQuery("select e from Cidade e where e.uf.id = :uf order by e.nome  desc", Cidade.class);
        query.setParameter("uf", uf);

        return query.getResultList();
    }
}
