package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "cadastro_freelas", schema = "demoday")
public class CadastroFreelas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "mei")
    private String mei;

    @Column(name = "area_formacao")
    private String areaFormacao;

    @Column(name = "sobremim")
    private String sobreMim;

    @ManyToOne
    @JoinColumn (name = "fk_iden_ger")
    private IdentificacaoGeral identificacaoGeral;


    public CadastroFreelas(String mei, String areaFormacao, String sobreMim, IdentificacaoGeral identificacaoGeral) {
        this.mei = mei;
        this.areaFormacao = areaFormacao;
        this.sobreMim = sobreMim;
        this.identificacaoGeral = identificacaoGeral;
    }

    public CadastroFreelas(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMei() {
        return mei;
    }

    public void setMei(String mei) {
        this.mei = mei;
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public IdentificacaoGeral getIdentificacaoGeral() {
        return identificacaoGeral;
    }

    public String getSobreMim() {
        return sobreMim;}

    public void setSobreMim(String sobreMim) {
        this.sobreMim = sobreMim;
    }

    public void setIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        this.identificacaoGeral = identificacaoGeral;
    }

}
