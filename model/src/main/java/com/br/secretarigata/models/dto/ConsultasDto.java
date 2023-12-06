package com.br.secretarigata.models.dto;

import java.util.Date;

public class ConsultasDto {
    private String nome;
    private Date data;
    public String getNome() {
        return nome;
    }

    public ConsultasDto(String nome, Date data) {
        this.nome = nome;
        this.data = data;
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
}
