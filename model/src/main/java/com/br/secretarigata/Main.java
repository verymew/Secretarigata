package com.br.secretarigata;

import com.br.secretarigata.models.Usuario;
import com.br.secretarigata.models.dao.UsuarioDao;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        UsuarioDao dao = new UsuarioDao();
        Usuario novo = new Usuario();
        novo.setNome("ju");
        novo.setCpf("5");
        novo.setEndereco("juuuu");
        novo.setSobrenome("cu");
        dao.salvar(novo);
    }

}