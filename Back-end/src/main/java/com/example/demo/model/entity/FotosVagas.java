package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "fotos_vaga", schema = "demoday")
public class FotosVagas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Lob
    private byte[] caminhoFt;

    @ManyToOne
    @JoinColumn(name = "fk_vaga")
    private IdentificacaoGeral identificacaoGeral;

    public FotosVagas(byte[] caminhoFt, IdentificacaoGeral identificacaoGeral) {
        this.caminhoFt = caminhoFt;
        this.identificacaoGeral = identificacaoGeral;
    }

    public FotosVagas() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getCaminhoFt() {
        return caminhoFt;
    }

    public void setCaminhoFt(byte[] caminhoFt) {
        this.caminhoFt = caminhoFt;
    }

    public IdentificacaoGeral getIdentificacaoGeral() {
        return identificacaoGeral;
    }

    public void setIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        this.identificacaoGeral = identificacaoGeral;
    }
}
