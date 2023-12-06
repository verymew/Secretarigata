package com.br.secretarigata.view.controller;

import com.br.secretarigata.controllers.ConsultaController;
import com.br.secretarigata.view.utils.Utilitarios;
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
        Utilitarios utils = new Utilitarios();
        ConsultaController controlador = new ConsultaController();
        try{
            controlador.registrarConsulta(namefield.getText(), lastnamefield.getText(), enderecofield.getText(), cpfield.getText());
            namefield.clear();
            enderecofield.clear();
            lastnamefield.clear();
            cpfield.clear();
            utils.exibirAlerta("Registrado!", Alert.AlertType.CONFIRMATION);
        }catch(Exception e){
            utils.exibirAlerta(e.getMessage(), Alert.AlertType.ERROR);
        }
    }

}

