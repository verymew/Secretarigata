package com.br.secretarigata.controllers.error;

public class ErrorHandler {
    public void validarCamposObrigatorios(String... campos) throws MensagemErro {
        for (String campo : campos) {
            if (campo == null || campo.isEmpty()) {
                throw new MensagemErro("Campos nulos.");
            }
        }
    }
}
