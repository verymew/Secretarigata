package com.br.secretarigata.models.dao;

import com.br.secretarigata.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UsuarioDao extends GenericDao<Usuario> {
    public Long pesquisarCpf(String cpf){
        EntityManager em = getEm();
        try{
            String jpql = "SELECT u.id FROM Usuario u WHERE u.cpf = :cpf";
            TypedQuery<Long> query = em.createQuery(jpql, Long.class);
            query.setParameter("cpf", cpf);
            return query.getSingleResult();
        }catch (Exception e){
            return null;
        }
    }
}
