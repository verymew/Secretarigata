package com.br.secretarigata.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VisualizarConsultas extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PaginaPrincipal.class.getResource("remover-visualizar-consultas.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 601, 620);
        stage.setTitle("Criar consulta");
        stage.setScene(scene);
        stage.show();
    }
}
