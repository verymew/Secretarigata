package com.br.secretarigata.controllers;


import com.br.secretarigata.controllers.dto.UsuarioDto;
import com.br.secretarigata.controllers.error.MensagemErro;
import com.br.secretarigata.models.Consultas;
import com.br.secretarigata.models.Usuario;
import com.br.secretarigata.models.dao.ConsultasDao;
import com.br.secretarigata.models.dao.UsuarioDao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaController {
    private UsuarioDao daousuario;
    private ConsultasDao daoconsulta;
    public ConsultaController(){
        daousuario = new UsuarioDao();
        daoconsulta = new ConsultasDao();
    }
    public void criarConsulta(String cpf, Date date) throws Exception {
        UsuarioDao userdao = new UsuarioDao();
        ConsultasDao consultasDao = new ConsultasDao();

        try {
            //pesquisa um usuario através do cpf
            Usuario novouser = userdao.pesquisarCpf(cpf);
            if(novouser == null){
                throw new Exception("CPF não encontrado.");
            }
            //registra uma consulta com data e com o usuario como FK
            Consultas novaconsulta = new Consultas();
            novaconsulta.setData_consulta(date);
            novaconsulta.setUser(novouser);
            //salva no banco
            consultasDao.salvar(novaconsulta);
        }catch (Exception e){
            throw new Exception("A consulta NÃO foi criada.");
        }
    }
    public void registrarConsulta(String nome, String sobrenome, String endereco, String cpf) throws Exception {
        validarCampos(nome, sobrenome, endereco, cpf);

        //criar cliente
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
    public List<UsuarioDto> visualizarClientes() {
        UsuarioDao dao = new UsuarioDao();
        List<Usuario> listaUsuarios = dao.buscarTodos(Usuario.class);
        return listaUsuarios.stream()
                .map(usuario -> new UsuarioDto(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getSobrenome(),
                        usuario.getEndereco(),
                        usuario.getCpf()))
                .collect(Collectors.toList());
    }
    private void validarCampos(String nome, String sobrenome, String endereco, String cpf) throws Exception {
        if (nome == null || nome.trim().isEmpty() || sobrenome == null || sobrenome.trim().isEmpty() ||
                endereco == null || endereco.trim().isEmpty() || cpf == null || cpf.trim().isEmpty()) {
            // Campos obrigatórios estão nulos ou vazios
            throw new Exception("Campos obrigatórios não podem ser nulos ou vazios.");
        }
    }
}
