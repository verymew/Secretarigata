package com.br.secretarigata.view.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaPrincipalController {

    @FXML
    private Button cadastrarcliente;

    @FXML
    private Button marcarconsulta;

    @FXML
    private Button visualizarconsulta;
    @FXML
    private Label welcomeText;
    @FXML
    void abrircliente(ActionEvent event) {
        abrirTela("pagina-criar-consulta.fxml", "Cadastrar cliente");
    }
    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }
    private void abrirTela(String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
