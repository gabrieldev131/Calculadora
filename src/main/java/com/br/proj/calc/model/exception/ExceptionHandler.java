package com.br.proj.calc.model.exception;

public class ExceptionHandler extends Exception {

    public void handleException(Exception e) {
        if (e instanceof OperacaoInvalidaException) {
            System.err.println("Essa opção não existe.");
        } else if (e instanceof DivisaoPorZeroException) {
            System.err.println("Divisão por zero não permitida.");
        } else {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
