package com.br.secretarigata.models.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GenericDao <T extends EntidadeBase>{
    //método para retornar uma factory criada
    public EntityManager getEm(){
        //Procura o arquivo de persistencia, onde fica a configuração do banco de dados
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("application");
        return factory.createEntityManager();
    }
    //métodos CRUD
    public T salvar(T t) throws Exception {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            if (t.getId() == null) {
                em.persist(t);
            } else {
                t = em.merge(t);
            }
            em.getTransaction().commit();
            return t;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public T buscarPorId(Class<T> clazz, Long id) {
        EntityManager em = getEm();
        T t = null;
        try {
            t = em.find(clazz, id);
        } finally {
            em.close();
        }
        return t;
    }

    public void excluir(Class<T> clazz, Long id) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            T entity = em.find(clazz, id);
            if (entity != null) {
                em.remove(entity);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
}
