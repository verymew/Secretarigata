package com.br.secretarigata.view.controller;

import com.br.secretarigata.models.Usuario;
import com.br.secretarigata.models.dao.UsuarioDao;
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
        Usuario novo = new Usuario();
        novo.setSobrenome("bostil");
        novo.setNome("Cuzil");
        novo.setCpf("0374");
        novo.setEndereco("esgotil");

        UsuarioDao dao = new UsuarioDao();

        dao.salvar(novo);

        try{

        }catch (Exception e){
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Mensagem de Exemplo" );
            alerta.setHeaderText(null);
            alerta.setContentText(e.toString());
            alerta.showAndWait();
        }


    }

}

