module model {
    opens com.br.secretarigata.models;

    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    exports com.br.secretarigata.models;
    exports com.br.secretarigata.models.dao;
}