package com.br.secretarigata;

import com.br.secretarigata.controllers.ConsultaController;
import com.br.secretarigata.models.Consultas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        ConsultaController controlador = new ConsultaController();

        String date = "2023-05-13";

        controlador.criarConsulta("03775447",date);
    }
}