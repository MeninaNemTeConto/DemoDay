package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "categorias_cursos", schema = "demoday")
public class CategoriaCursos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column(name = "nome_cate")
    private String nome_cate;


    public CategoriaCursos(String nome_cate) {
        this.nome_cate = nome_cate;
    }

    public CategoriaCursos(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_cate() {
        return nome_cate;
    }

    public void setNome_cate(String nome_cate) {
        this.nome_cate = nome_cate;
    }
}
