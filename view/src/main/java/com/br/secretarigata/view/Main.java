package com.br.secretarigata.view;

import com.br.secretarigata.controllers.ConsultaController;
import com.br.secretarigata.controllers.dto.UsuarioDto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsultaController controlador = new ConsultaController();
        List<UsuarioDto> listaUsuarios = controlador.visualizarClientes();

        for(UsuarioDto usuario : listaUsuarios){
            System.out.println(usuario.getCpf());
        }
    }
}
