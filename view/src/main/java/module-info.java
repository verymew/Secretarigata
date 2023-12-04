module com.br.secretarigata.view {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.br.secretarigata.view to javafx.fxml;
    exports com.br.secretarigata.view;
    exports com.br.secretarigata.view.controller;
    opens com.br.secretarigata.view.controller to javafx.fxml;
}