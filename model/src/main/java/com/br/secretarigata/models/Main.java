package com.br.secretarigata.models;

import com.br.secretarigata.models.dao.UsuarioDao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioDao dao = new UsuarioDao();
        Long teste = dao.pesquisarCpf("0374");

        System.out.println("Id: " + teste);
    }
}
