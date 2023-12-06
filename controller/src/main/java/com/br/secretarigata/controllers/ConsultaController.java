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
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nome);
        novoUsuario.setSobrenome(sobrenome);
        novoUsuario.setEndereco(endereco);
        novoUsuario.setCpf(cpf);

        //registrar
        try{
            daousuario.salvar(novoUsuario);
        }catch(Exception e){
            throw new MensagemErro("Consulta NÃO registrada. Tente de novo." + e);
        }
    }
    public void excluirConsulta(){

    }
    public void visualizarConsultas(){

    }
}
