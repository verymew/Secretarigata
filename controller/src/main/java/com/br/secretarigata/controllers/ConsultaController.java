package com.br.secretarigata.controllers;


import com.br.secretarigata.controllers.error.MensagemErro;
import com.br.secretarigata.models.Usuario;
import com.br.secretarigata.models.dao.ConsultasDao;
import com.br.secretarigata.models.dao.UsuarioDao;

public class ConsultaController {
    private UsuarioDao daousuario;
    private ConsultasDao daoconsulta;
    public ConsultaController(){
        daousuario = new UsuarioDao();
        daoconsulta = new ConsultasDao();
    }
    public void registrarConsulta(String nome, String sobrenome, String endereco, String cpf) throws Exception {
        validarCampos(nome, sobrenome, endereco, cpf);

        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nome);
        novoUsuario.setSobrenome(sobrenome);
        novoUsuario.setEndereco(endereco);
        novoUsuario.setCpf(cpf);

        //registrar
        try {
            daousuario.salvar(novoUsuario);
        }catch (Exception e){
            //joga para a view
            throw new Exception("Não foi possível registrar.");
        }
    }
    public void excluirConsulta(){

    }
    public void visualizarConsultas(){

    }
    private void validarCampos(String nome, String sobrenome, String endereco, String cpf) throws Exception {
        if (nome == null || nome.trim().isEmpty() || sobrenome == null || sobrenome.trim().isEmpty() ||
                endereco == null || endereco.trim().isEmpty() || cpf == null || cpf.trim().isEmpty()) {
            // Campos obrigatórios estão nulos ou vazios
            throw new Exception("Campos obrigatórios não podem ser nulos ou vazios.");
        }
    }
}
