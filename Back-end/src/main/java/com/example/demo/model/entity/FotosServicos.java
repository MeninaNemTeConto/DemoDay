package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "fotos_servicos", schema = "demoday")
public class FotosServicos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Lob
    private byte[] caminhoFt;

    @Column(name = "data_ft")
    private String dataFt;

    @Column(name = "titulo_ft")
    private String tituloDt;

    @ManyToOne
    @JoinColumn(name = "fk_casd_freela")
    private CadastroFreelas cadastroFreelas;

    public FotosServicos(byte[] caminhoFt, String dataFt, String tituloDt, CadastroFreelas cadastroFreelas) {
        this.caminhoFt = caminhoFt;
        this.dataFt = dataFt;
        this.tituloDt = tituloDt;
        this.cadastroFreelas = cadastroFreelas;
    }

    public FotosServicos(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getCaminhoFt() {
        return caminhoFt;
    }

    public void setCaminhoFt(byte[] caminhoFt) {
        this.caminhoFt = caminhoFt;
    }

    public String getDataFt() {
        return dataFt;
    }

    public void setDataFt(String dataFt) {
        this.dataFt = dataFt;
    }

    public String getTituloDt() {
        return tituloDt;
    }

    public void setTituloDt(String tituloDt) {
        this.tituloDt = tituloDt;
    }

    public CadastroFreelas getCadastroFreelas() {
        return cadastroFreelas;
    }

    public void setCadastroFreelas(CadastroFreelas cadastroFreelas) {
        this.cadastroFreelas = cadastroFreelas;
    }
}
