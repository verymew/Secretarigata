package com.br.secretarigata.models;

import com.br.secretarigata.models.dao.EntidadeBase;
import jakarta.persistence.*;

import java.util.Date;

@Entity
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
    public Date getData_consulta(){
        return data_consulta;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setData_consulta(Date data_consulta) {
        this.data_consulta = data_consulta;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
