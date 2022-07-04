package com.example.demo.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "cursos", schema = "demoday")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "nome_curso")
    private String nomeCurso;

    @Column(name = "instituicao")
    private String instituicao;

    @Column(name = "valor")
    private String valor;

    @Column(name = "tipo_formacao")
    private String tipoFormacao;

    @OneToOne
    @JoinColumn (name = "fk_categorias")
    private CategoriaCursos categoriaCursos;


    public Cursos(String nomeCurso, String instituicao, String valor, String tipoFormacao, CategoriaCursos categoriaCursos) {
        this.nomeCurso = nomeCurso;
        this.instituicao = instituicao;
        this.valor = valor;
        this.tipoFormacao = tipoFormacao;
        this.categoriaCursos = categoriaCursos;
    }

    public Cursos(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipoFormacao() {
        return tipoFormacao;
    }

    public void setTipoFormacao(String tipoFormacao) {
        this.tipoFormacao = tipoFormacao;
    }

    public CategoriaCursos getCategoriaCursos() {
        return categoriaCursos;
    }

    public void setCategoriaCursos(CategoriaCursos categoriaCursos) {
        this.categoriaCursos = categoriaCursos;
    }
}
