package com.br.secretarigata.view.controller;

import com.br.secretarigata.controllers.ConsultaController;
import com.br.secretarigata.controllers.dto.ConsultasDTO;

import com.br.secretarigata.controllers.dto.UsuarioDto;
import com.br.secretarigata.view.utils.Utilitarios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class RemoverVisualizarConsultasController {
    @FXML
    private TableColumn<?, ?> cpf;

    @FXML
    private TableColumn<?, ?> datacon;

    @FXML
    private TableColumn<?, ?> endereco;

    @FXML
    private TableView<ConsultasDTO> listaconsultas;

    @FXML
    private TableColumn<?, ?> nome;

    @FXML
    private Button removerconsulta;

    @FXML
    private TableColumn<?, ?> sobrenome;
    public void initialize() throws Exception {
        ConsultaController controlador = new ConsultaController();
        List<ConsultasDTO> todos = controlador.retornarTodasConsultas();

        // Criar tabela
        ObservableList<ConsultasDTO> observableList = FXCollections.observableArrayList(todos);

        // Configurar a TableView
        listaconsultas.setItems(observableList);

        // Configurar as colunas
        endereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        cpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        sobrenome.setCellValueFactory(new PropertyValueFactory<>("sobrenome"));
        nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        datacon.setCellValueFactory(new PropertyValueFactory<>("data"));
    }
    @FXML
    void removeconsulta(ActionEvent event) throws Exception {
        Utilitarios utils = new Utilitarios();
        ConsultaController controlador = new ConsultaController();
        try{
            //pega o cpf para remover.
            ConsultasDTO consultaclicada = listaconsultas.getSelectionModel().getSelectedItem();
            //remove
            String cpf = consultaclicada.getCpf();
            controlador.excluirConsulta(cpf);
            utils.exibirAlerta(cpf, Alert.AlertType.CONFIRMATION);
        }catch (Exception e){
            utils.exibirAlerta("Algum erro ocorreu." + e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}
