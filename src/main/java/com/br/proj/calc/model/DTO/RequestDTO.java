package com.br.proj.calc.model.DTO;

public class RequestDTO {
    private String opcao;
    private double valor1;
    private double valor2;

    public RequestDTO(String opcao, double valor1, double valor2) {
        this.opcao = opcao;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }


    public String getOption() {
        return opcao;
    }

    public void setOption(String opcao) {
        this.opcao = opcao;
    }

    public double getValue1() {
        return valor1;
    }

    public void setValue1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValue2() {
        return valor2;
    }

    public void setValue2(double valor2) {
        this.valor2 = valor2;
    }
}
