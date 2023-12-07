package com.br.secretarigata.view.controller;

import com.br.secretarigata.view.PaginaPrincipal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaginaPrincipalController {

    @FXML
    private Button cadastrarcliente;

    @FXML
    private Button marcarconsulta;

    @FXML
    private AnchorPane principal;

    @FXML
    private Button visualizarconsulta;

    @FXML
    private Label welcomeText;

    @FXML
    void mudarparacliente(ActionEvent event) throws IOException {
        FXMLLoader fx = new FXMLLoader(PaginaPrincipalController.class.getResource("/com/br/secretarigata/view/pagina-criar-consulta.fxml"));
        Scene s = new Scene(fx.load());
        Stage st = new Stage();
        st.setTitle("Cadastrar cliente");
        st.setScene(s);
        st.show();
    }

    @FXML
    void visualizaremover(ActionEvent event) throws IOException {
        FXMLLoader fx = new FXMLLoader(PaginaPrincipalController.class.getResource("/com/br/secretarigata/view/remover-visualizar-consultas.fxml"));
        Scene s = new Scene(fx.load());
        Stage st = new Stage();
        st.setTitle("Visualizar e remover consultas");
        st.setScene(s);
        st.show();
    }
    @FXML
    void marcaconsultas(ActionEvent event) throws IOException {
        FXMLLoader fx = new FXMLLoader(PaginaPrincipalController.class.getResource("/com/br/secretarigata/view/visualizar-consultas.fxml"));
        Scene s = new Scene(fx.load());
        Stage st = new Stage();
        st.setTitle("Marcar consulta");
        st.setScene(s);
        st.show();
    }}
