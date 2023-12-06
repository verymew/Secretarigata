package com.br.secretarigata.models.dao;

import com.br.secretarigata.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.hibernate.result.NoMoreReturnsException;

import java.util.List;

public class UsuarioDao extends GenericDao<Usuario> {
    public Usuario pesquisarCpf(String cpf) {
        EntityManager em = getEm();
        try {
            String jpql = "SELECT u FROM Usuario u WHERE u.cpf = :cpf";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("cpf", cpf);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
}
