package com.br.dentuda.models.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            // Configuração do Hibernate
            Configuration configuration = new Configuration();
            configuration.configure("/hibernate.cfg.xml"); // Carrega as configurações padrão do hibernate.cfg.xml

            // Construir a SessionFactory
            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(registryBuilder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}