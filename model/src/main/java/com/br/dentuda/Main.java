package com.br.dentuda;

import com.br.dentuda.models.Usuario;
import com.br.dentuda.models.dao.HibernateUtil;
import com.br.dentuda.models.dao.UsuarioDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.UUID;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        UsuarioDao dao = new UsuarioDao();
        Usuario novo = new Usuario();
        novo.setNome("juca");
        novo.setCpf("03770602080");
        novo.setEndereco("bonpland, 1047");

        dao.salvar(novo);



    }

}