package com.br.secretarigata.view.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RemoverVisualizarConsultasController {

    @FXML
    private TableColumn<?, ?> cpf;

    @FXML
    private TableColumn<?, ?> datacon;

    @FXML
    private TableColumn<?, ?> endereco;

    @FXML
    private TableView<?> listaconsultas;

    @FXML
    private TableColumn<?, ?> nome;

    @FXML
    private Button removerconsulta;

    @FXML
    private TableColumn<?, ?> sobrenome;

}
