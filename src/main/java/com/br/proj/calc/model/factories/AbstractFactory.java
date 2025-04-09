package com.br.proj.calc.model.factories;

import java.lang.reflect.InvocationTargetException;
import com.br.proj.calc.model.exception.*;

public class AbstractFactory<T> implements IFactory <T>{
//oi
    protected String pacoteBase = "com.br.proj.calc.model.";
    @Override
    public T criar(String opcao) throws OperacaoInvalidaException {
        try {
            // Mapeamento da opção para o nome da classe correspondente
            pacoteBase = this.pacoteBase + opcao;
            // Usa reflexão para instanciar a classe correspondente
            Class<?> classeOperacao = Class.forName(pacoteBase);
            return (T) classeOperacao.getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new OperacaoInvalidaException("Erro ao criar instância da operação: " + e.getMessage());
        }
    }
}
