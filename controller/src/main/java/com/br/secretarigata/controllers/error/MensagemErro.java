package com.br.secretarigata.controllers.error;
public class MensagemErro extends Exception{
    public MensagemErro(String mensagem){
        super(mensagem);
    }
}
