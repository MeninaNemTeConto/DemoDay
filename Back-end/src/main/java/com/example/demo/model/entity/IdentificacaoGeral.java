package com.example.demo.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "identificacao_geral", schema = "demoday")
public class IdentificacaoGeral {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "nome_social")
    private String nome_social;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "dt_nascimento")
    private String dtNascimento;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cep")
    private String cep;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "dt_cadastro")
    private String dtCadastro;

    @Column(name = "status")
    private int status;



    public IdentificacaoGeral(){};

    public IdentificacaoGeral(String nome, String sobrenome, String nome_social,
                              String cpf, String dtNascimento, String telefone,
                              String cep, String email, String senha,
                              String dtCadastro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nome_social = nome_social;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
        this.senha = senha;
        this.dtCadastro = dtCadastro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDt_nascimento() {
        return dtNascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dtNascimento = dt_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDt_cadastro() {
        return dtCadastro;
    }

    public void setDt_cadastro(String dt_cadastro) {
        this.dtCadastro = dt_cadastro;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
}
