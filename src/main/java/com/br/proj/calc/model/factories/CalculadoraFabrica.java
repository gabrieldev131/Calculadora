package com.br.proj.calc.model.factories;

import com.br.proj.calc.model.operation.contracts.*;

public class CalculadoraFabrica extends AbstractFactory<IOperacaoStrategy> {

    public CalculadoraFabrica(){
        super.pacoteBase = super.pacoteBase+".calculadora.";
    }


}
