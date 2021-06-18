package br.com.senai.domain.exception;

public class EntidadeNãoEncontradaException extends NegocioException{
    public EntidadeNãoEncontradaException(String message){
        super(message);
    }
}
