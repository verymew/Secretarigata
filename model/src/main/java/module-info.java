module model {
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    exports com.br.secretarigata.models;
    exports com.br.secretarigata.models.dao;

    opens com.br.secretarigata.models to controller;
    opens com.br.secretarigata.models.dao to controller;
}