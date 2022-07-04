package com.example.demo.model.entity;

import org.springframework.beans.factory.annotation.Value;
import javax.persistence.*;

@Entity
@Table(name = "fotos_iden_ger", schema = "demoday")
public class FotosIdenGer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    // TODO: Criar imagem padrão
    @Lob
    @Value("${property_name:#{null}}")
    private byte[] caminhoFt;

    @ManyToOne
    @JoinColumn(name = "fk_iden")
    private IdentificacaoGeral identificacaoGeral;

    public FotosIdenGer(byte[] caminhoFt, IdentificacaoGeral identificacaoGeral) {
        this.caminhoFt = caminhoFt;
        this.identificacaoGeral = identificacaoGeral;
    }

    public FotosIdenGer() {}

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

    public IdentificacaoGeral getIdentificacaoGeral() {
        return identificacaoGeral;
    }

    public void setIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        this.identificacaoGeral = identificacaoGeral;
    }
}
