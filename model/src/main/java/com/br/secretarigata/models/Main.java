package com.br.secretarigata.models;

import com.br.secretarigata.models.dao.ConsultasDao;
import com.br.secretarigata.models.dao.UsuarioDao;
import com.br.secretarigata.models.dto.ConsultasDto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ConsultasDao dao = new ConsultasDao();

        List<ConsultasDto> amadeus = dao.todasconsultas();

        for(ConsultasDto consulta : amadeus){
            System.out.println("Nome: " + consulta.getNome() + " CPF: " + consulta.getCpf() + " Data: " + consulta.getData());
        }
    }
}
