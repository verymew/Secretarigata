package com.br.secretarigata.controllers;


import com.br.secretarigata.controllers.dto.ConsultasDTO;
import com.br.secretarigata.controllers.dto.UsuarioDto;
import com.br.secretarigata.controllers.error.MensagemErro;
import com.br.secretarigata.models.Consultas;
import com.br.secretarigata.models.Usuario;
import com.br.secretarigata.models.dao.ConsultasDao;
import com.br.secretarigata.models.dao.UsuarioDao;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaController {
    private UsuarioDao daousuario;
    private ConsultasDao daoconsulta;
    public ConsultaController(){
        daousuario = new UsuarioDao();
        daoconsulta = new ConsultasDao();
    }
    public void criarConsulta(String cpf, String date) throws Exception {
        try {
            //pesquisa um usuario através do cpf
            Usuario novouser = daousuario.pesquisarCpf(cpf);
            if(novouser == null){
                throw new Exception("CPF não encontrado.");
            }
            Consultas novaconsulta = new Consultas();
            // Ajustando o formato da data para "yyyy-MM-dd"
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(date);
            Date data = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            //salavndo na instancia
            novaconsulta.setData_consulta(data);
            novaconsulta.setUser(novouser);

            //salva no banco
            daoconsulta.salvar(novaconsulta);
        }catch (Exception e){
            throw new Exception("A consulta NÃO foi criada." + e.getMessage());
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
    public void excluirConsulta(String cpf) throws Exception {
        //receber CPF para retornar um ID
        Usuario user = daousuario.pesquisarCpf(cpf);

        //apagar a consulta pelo id
        daoconsulta.excluir(Consultas.class, user.getId());
    }
    public List<UsuarioDto> visualizarClientes() {
        List<Usuario> listaUsuarios = daousuario.buscarTodos(Usuario.class);
        return listaUsuarios.stream()
                .map(usuario -> new UsuarioDto(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getSobrenome(),
                        usuario.getEndereco(),
                        usuario.getCpf()))
                .collect(Collectors.toList());
    }
    public List<ConsultasDTO> retornarTodasConsultas() throws Exception {
        List<Object[]> resultado = daoconsulta.todasconsultas();
        List<ConsultasDTO> todas = new ArrayList<>();
        //Converte os objetos
        for (Object[] obj : resultado) {
            // Certifique-se de que os tipos estão corretos (String e Date)
            String nome = (String) obj[0];
            Date data = (Date) obj[1];
            String sobrenome = (String) obj[2];
            String cpf = (String) obj[3];
            String endereco = (String) obj[4];
            ConsultasDTO dto = new ConsultasDTO(nome, data, sobrenome, cpf, endereco);
            todas.add(dto);
        }
        return todas;
    }
    private void validarCampos(String nome, String sobrenome, String endereco, String cpf) throws Exception {
        if (nome == null || nome.trim().isEmpty() || sobrenome == null || sobrenome.trim().isEmpty() ||
                endereco == null || endereco.trim().isEmpty() || cpf == null || cpf.trim().isEmpty()) {
            // Campos obrigatórios estão nulos ou vazios
            throw new Exception("Campos obrigatórios não podem ser nulos ou vazios.");
        }
    }
}
