package com.br.secretarigata;

import com.br.dentuda.models.Usuario;
import com.br.dentuda.models.dao.ConsultasDao;
import com.br.dentuda.models.dao.UsuarioDao;
import com.br.secretarigata.error.MensagemErro;

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
