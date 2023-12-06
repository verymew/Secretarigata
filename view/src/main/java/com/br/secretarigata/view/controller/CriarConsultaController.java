package com.br.secretarigata.view.controller;

import com.br.secretarigata.controllers.ConsultaController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CriarConsultaController {

    @FXML
    private TextField cpfield;

    @FXML
    private Button createbutton;

    @FXML
    private TextField enderecofield;

    @FXML
    private TextField lastnamefield;

    @FXML
    private TextField namefield;
    @FXML
    void criarNovaConsulta(ActionEvent event) throws Exception {
        ConsultaController controlador = new ConsultaController();
        try{
            controlador.registrarConsulta(namefield.getText(), lastnamefield.getText(), enderecofield.getText(), cpfield.getText());
        }catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Alerta");
            alerta.setHeaderText(null);
            alerta.setContentText(e.getMessage());
            alerta.showAndWait();
        }
    }

}

