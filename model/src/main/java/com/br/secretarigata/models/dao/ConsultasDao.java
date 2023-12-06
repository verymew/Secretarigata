package com.br.secretarigata.models.dao;

import com.br.secretarigata.models.Consultas;
import com.br.secretarigata.models.dto.ConsultasDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class ConsultasDao {
    public List<ConsultasDto> todasconsultas() throws Exception {
        GenericDao generic = new GenericDao();
        EntityManager em = generic.getEm();
        try {
            //faz a query
            String jpql = "SELECT u.nome, c.data_consulta FROM Usuario u, Consultas c WHERE u.id = c.user.id";
            Query query = em.createQuery(jpql);
            List<Object[]> resultado = query.getResultList();
            //insntancia uma arraylist do tipo consultas dto
            List<ConsultasDto> todas = new ArrayList<>();

            for (Object[] obj : resultado) {
                // Certifique-se de que os tipos estão corretos (String e Date)
                String nome = (String) obj[0];
                Date data = (Date) obj[1];
                ConsultasDto dto = new ConsultasDto(nome, data);
                todas.add(dto);
            }

            return todas;
        } catch (Exception e) {
            throw new Exception("Não foi!!!" + e.getMessage());
        } finally {
            em.close();
        }
    }
}