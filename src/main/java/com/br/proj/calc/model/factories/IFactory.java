package com.br.proj.calc.model.factories;

import com.br.proj.calc.model.exception.OperacaoInvalidaException;

public interface IFactory<T>{

    T criar(String opcao) throws OperacaoInvalidaException;

}
