package com.br.secretarigata.models.dto;

import java.util.Date;

public class ConsultasDto {
    private String nome;
    private Date data;
    private String sobrenome;
    private String cpf;
    private String endereco;

    public ConsultasDto(String nome, Date data, String sobrenome, String cpf, String endereco) {
        this.nome = nome;
        this.data = data;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
