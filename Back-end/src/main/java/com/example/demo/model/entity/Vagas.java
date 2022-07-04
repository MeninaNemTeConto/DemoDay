package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "vagas", schema = "demoday")
public class Vagas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "titulo_vaga")
    private String tituloVaga;

    @Column(name = "dt_postagem")
    private String dtPostagem;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "pagamento")
    private String pagamento;

    @Column(name = "urgencia")
    private String urgencia;

    @Column(name = "dispo")
    private String dispo;

    @Column(name = "status")
    private int status;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "fk_iden_ger")
    private IdentificacaoGeral identificacaoGeral;

    public Vagas(){}

    public Vagas(String tituloVaga, String dtPostagem, String descricao,
                 String pagamento, String urgencia, String dispo,
                 IdentificacaoGeral identificacaoGeral) {
        this.tituloVaga = tituloVaga;
        this.dtPostagem = dtPostagem;
        this.descricao = descricao;
        this.pagamento = pagamento;
        this.urgencia = urgencia;
        this.dispo = dispo;
        this.identificacaoGeral = identificacaoGeral;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTituloVaga() {
        return tituloVaga;
    }

    public void setTituloVaga(String tituloVaga) {
        this.tituloVaga = tituloVaga;
    }

    public String getDtPostagem() {
        return dtPostagem;
    }

    public void setDtPostagem(String dtPostagem) {
        this.dtPostagem = dtPostagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getDispo() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public IdentificacaoGeral getIdentificacaoGeral() {
        return identificacaoGeral;
    }

    public void setIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        this.identificacaoGeral = identificacaoGeral;
    }
}
