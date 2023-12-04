package com.br.dentuda.models;

import com.br.dentuda.models.dao.EntidadeBase;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "consultas")
public class Consultas implements EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data_consulta;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario user;
    @Override
    public Long getId() {
        return null;
    }
}
