package com.br.proj.calc.model.factories;

import com.br.proj.calc.model.operation.contracts.*;

public class OperacaoFabrica extends AbstractFactory<IOperacaoStrategy> {

    public OperacaoFabrica(){
        super.pacoteBase = super.pacoteBase+"operation.operationUserCase.";
    }

}
