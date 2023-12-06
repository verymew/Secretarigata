package com.br.secretarigata;

import com.br.secretarigata.controllers.ConsultaController;
import com.br.secretarigata.controllers.dto.ConsultasDTO;
import com.br.secretarigata.models.Consultas;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        ConsultaController controlador = new ConsultaController();

        controlador.excluirConsulta("03775447");

    }
}