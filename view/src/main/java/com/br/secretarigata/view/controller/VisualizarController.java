package com.br.secretarigata.view.controller;

import com.br.secretarigata.controllers.ConsultaController;
import com.br.secretarigata.controllers.dto.UsuarioDto;
import com.br.secretarigata.view.utils.Utilitarios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class VisualizarController {
    @FXML
    private Button marcarconsulta;
    @FXML
    private TableView<UsuarioDto> consultaslist;
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
    @FXML
    private TableColumn<?, ?> idfield;
    @FXML
    private DatePicker dataexata;


    public void initialize() {
        ConsultaController controlador = new ConsultaController();
        List<UsuarioDto> listaUsuariosDTO = controlador.visualizarClientes();

        // Cria um ObservableList a partir da lista de DTOs
        ObservableList<UsuarioDto> observableList = FXCollections.observableArrayList(listaUsuariosDTO);

        // Configura a TableView
        consultaslist.setItems(observableList);
        // Configura as colunas
        address.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        cpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        lastname.setCellValueFactory(new PropertyValueFactory<>("sobrenome"));
        name.setCellValueFactory(new PropertyValueFactory<>("nome"));
    }
    @FXML
    void marcaconsulta(ActionEvent event) {
        ConsultaController controlador = new ConsultaController();
        Utilitarios utils = new Utilitarios();
        try{
            //resgata valores
            UsuarioDto puto = consultaslist.getSelectionModel().getSelectedItem();
            String data = dataexata.getValue().toString();
            controlador.criarConsulta(puto.getCpf(), data);
            utils.exibirAlerta("Consulta marcada!", Alert.AlertType.CONFIRMATION);
        }catch (Exception e){
            utils.exibirAlerta(e.getMessage(), Alert.AlertType.ERROR);
        }
    }

}

