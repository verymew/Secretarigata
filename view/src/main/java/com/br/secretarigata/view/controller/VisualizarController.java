package com.br.secretarigata.view.controller;

import com.br.secretarigata.controllers.ConsultaController;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class VisualizarController {
    @FXML
    private TableView<?> consultaslist;

    @FXML
    private TableColumn<?, ?> address;

    @FXML
    private TableColumn<?, ?> cpf;

    @FXML
    private TableColumn<?, ?> dateof;

    @FXML
    private TableColumn<?, ?> lastname;

    @FXML
    private TableColumn<?, ?> name;


}

