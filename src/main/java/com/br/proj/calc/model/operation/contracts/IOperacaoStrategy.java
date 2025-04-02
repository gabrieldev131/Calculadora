package com.br.proj.calc.model.operation.contracts;

import com.br.proj.calc.model.DTO.*;

public interface IOperacaoStrategy {

    public ResponseDTO operar (RequestDTO values) throws  ArithmeticException;
}
