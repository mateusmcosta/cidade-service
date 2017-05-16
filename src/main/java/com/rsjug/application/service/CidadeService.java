package com.rsjug.application.service;

import com.rsjug.application.persistence.dao.CidadeDAO;
import com.rsjug.application.persistence.entity.Cidade;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by mateus on 13/05/17.
 */
@Stateless
public class CidadeService {

    @Inject
    private CidadeDAO cidadeDAO;

    public List<Cidade> findByUf(String uf) {
        return cidadeDAO.findByUf(uf);
    }
}
