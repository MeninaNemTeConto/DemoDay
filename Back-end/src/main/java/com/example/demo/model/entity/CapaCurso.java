package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "capa_cursos", schema = "demoday")
public class CapaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private  Long id;

    @Column(name = "caminho_ft")
    private byte[] caminho_ft;

    @ManyToOne
    @JoinColumn(name = "fkey_cursos")
    private Cursos cursos;


    public CapaCurso(byte[] caminho_ft, Cursos cursos) {
        this.caminho_ft = caminho_ft;
        this.cursos = cursos;
    }

    public CapaCurso() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getCaminho_ft() {
        return caminho_ft;
    }

    public void setCaminho_ft(byte[] caminho_ft) {
        this.caminho_ft = caminho_ft;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }
}
