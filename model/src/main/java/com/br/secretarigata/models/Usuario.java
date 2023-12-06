package com.br.secretarigata.models;

import com.br.secretarigata.models.dao.EntidadeBase;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "usuario")
public class Usuario implements EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "sobrenome", nullable = false, length = 100)
    private String sobrenome;
    @Column(name = "endereco", nullable = false)
    private String endereco;
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;
    @Override
    public Long getId() {
        return id;
    }
}

