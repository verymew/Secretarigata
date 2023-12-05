package com.br.secretarigata.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CriarConsulta extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PaginaPrincipal.class.getResource("pagina-criar-consulta.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 453);
        stage.setTitle("Criar consulta");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
