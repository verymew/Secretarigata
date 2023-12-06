package com.br.secretarigata.models;

import com.br.secretarigata.models.dao.UsuarioDao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioDao dao = new UsuarioDao();
        List<Usuario> todos = dao.buscarTodos(Usuario.class);

        for(Usuario usuario : todos){
            System.out.println(usuario.getNome());
        }
    }
}
