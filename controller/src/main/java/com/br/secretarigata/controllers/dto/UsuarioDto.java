package com.br.secretarigata.controllers.dto;

public class UsuarioDto {
    private Long id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String cpf;
    public UsuarioDto(Long id, String nome, String sobrenome, String endereco, String cpf) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
