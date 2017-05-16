package com.rsjug.application.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mateus on 13/05/17.
 */
@Entity
@Table(name = "CIDADE")
public class Cidade implements Serializable {


    private Long id;
    private String nome;
    private Uf uf;

    public Cidade() {}

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "NOME")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @ManyToOne
    @JoinColumn(name = "UF", referencedColumnName = "UF")
    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cidade)) return false;

        Cidade cidade = (Cidade) o;

        return getId().equals(cidade.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
