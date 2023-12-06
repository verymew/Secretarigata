package com.br.secretarigata.models.dao;

import com.br.secretarigata.models.Consultas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class ConsultasDao extends GenericDao<Consultas>{
    public List<Object[]> todasconsultas() throws Exception {
        GenericDao generic = new GenericDao();
        EntityManager em = generic.getEm();
        try {
            //faz a query
            String jpql = "SELECT u.nome, c.data_consulta, u.sobrenome, u.cpf, u.endereco FROM Usuario u, Consultas c WHERE u.id = c.user.id";
            Query query = em.createQuery(jpql);
            List<Object[]> resultado = query.getResultList();
            //insntancia uma arraylist do tipo consultas dto

            return resultado;
        } catch (Exception e) {
            throw new Exception("Não foi!!!" + e.getMessage());
        } finally {
            em.close();
        }
    }
}