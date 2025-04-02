package com.br.proj.calc.model.operation.operationStrategy;

import com.br.proj.calc.model.DTO.*;
import com.br.proj.calc.model.operation.contracts.*;

public class OperationStrategy implements IOperacaoStrategy{

    private IOperacaoStrategy strategy;

    public void setStrategy(IOperacaoStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public ResponseDTO operar(RequestDTO values) throws  ArithmeticException{
        return strategy.operar(values);
    }
}
