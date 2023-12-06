package com.br.secretarigata;

import com.br.secretarigata.controllers.ConsultaController;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        ConsultaController controlador = new ConsultaController();
        controlador.registrarConsulta("Julii","liee","bompland", "03775447");
    }
}