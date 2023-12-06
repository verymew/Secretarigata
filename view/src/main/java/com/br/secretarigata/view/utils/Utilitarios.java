package com.br.secretarigata.view.utils;

import javafx.scene.control.Alert;

public class Utilitarios {
    public Utilitarios(){
    }
    public void exibirAlerta(String mensagem, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle("Alerta");
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
}
