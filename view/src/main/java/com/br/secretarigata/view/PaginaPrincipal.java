package com.br.secretarigata.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaPrincipal extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PaginaPrincipal.class.getResource("pagina-principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 522, 549);
        stage.setTitle("Secretarigata");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}