package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "certificados", schema = "demoday")
public class Certificados {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "nome_certificado")
    private String nomeCertificado;

    @ManyToOne
    @JoinColumn(name = "fk_freelas")
    private CadastroFreelas cadastroFreelas;

    public Certificados(String nomeCertificado, CadastroFreelas cadastroFreelas) {
        this.nomeCertificado = nomeCertificado;
        this.cadastroFreelas = cadastroFreelas;
    }

    public Certificados(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCertificado() {
        return nomeCertificado;
    }

    public void setNomeCertificado(String nomeCertificado) {
        this.nomeCertificado = nomeCertificado;
    }

    public CadastroFreelas getCadastroFreelas() {
        return cadastroFreelas;
    }

    public void setCadastroFreelas(CadastroFreelas cadastroFreelas) {
        this.cadastroFreelas = cadastroFreelas;
    }
}
