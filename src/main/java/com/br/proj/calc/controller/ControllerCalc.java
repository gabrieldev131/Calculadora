package com.br.proj.calc.controller;

import com.br.proj.calc.model.DTO.*;
import com.br.proj.calc.model.exception.*;
import com.br.proj.calc.model.factories.OperacaoFabrica;
import com.br.proj.calc.model.operation.contracts.*;
import com.br.proj.calc.model.operation.operationStrategy.OperationStrategy;

public class ControllerCalc {
    public ResponseDTO calcular(RequestDTO requestDTO) throws OperacaoInvalidaException, DivisaoPorZeroException {
        IOperacaoStrategy operacao= new OperationStrategy();
        OperacaoFabrica fabrica = new OperacaoFabrica();
        ((OperationStrategy) operacao).setStrategy(fabrica.criar(requestDTO.getOption()));

        return operacao.operar(requestDTO);
    }
}
