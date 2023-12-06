package com.br.secretarigata.models;

import com.br.secretarigata.models.dao.ConsultasDao;
import com.br.secretarigata.models.dao.UsuarioDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        UsuarioDao dao = new UsuarioDao();
        Usuario teste = dao.pesquisarCpf("0374");

        String dataString = "31/12/2023"; // Substitua isso pela sua string de data
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date data = dateFormat.parse(dataString);

        ConsultasDao consultasDao = new ConsultasDao();
        Consultas nova = new Consultas();
        nova.setUser(teste);
        nova.setData_consulta(data);

        consultasDao.salvar(nova);



        System.out.println("Data: " + nova.getData_consulta());
    }
}
