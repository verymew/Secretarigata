package com.br.secretarigata.view;

import com.br.secretarigata.view.controller.CriarConsultaController;
import com.br.secretarigata.view.utils.Utilitarios;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CriarConsulta extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PaginaPrincipal.class.getResource("visualizar-consultas.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 601, 620);
        stage.setTitle("Criar consulta");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
