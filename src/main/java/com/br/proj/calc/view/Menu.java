package com.br.proj.calc.view;

import java.util.Scanner;
import com.br.proj.calc.model.DTO.RequestDTO;
import com.br.proj.calc.model.DTO.ResponseDTO;
import com.br.proj.calc.model.operation.contracts.IOperacaoStrategy;

import org.reflections.Reflections;
import java.util.Set;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in); // Scanner único

    public static void show() {
        Reflections reflections = new Reflections("com.br.proj.calc.model.operation.operationUserCase"); // Substitua pelo seu pacote

        // Busca todas as classes que implementam a interface IOperation
        Set<Class<? extends IOperacaoStrategy>> classes = reflections.getSubTypesOf(IOperacaoStrategy.class);

        System.out.println("Informe uma operação: ");
        int escolha = 0;
        // Imprime o nome das classes que implementam a interface
        for (Class<? extends IOperacaoStrategy> clazz : classes) {
            escolha++;
            System.out.println(escolha + ". " + clazz.getSimpleName());
        }
    }

    public RequestDTO retriveValue() {
        System.out.println("Informe a operação:");
        String opcao = scanner.nextLine();
        
        System.out.println("Informe o valor 1:");
        int valor1 = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        
        System.out.println("Informe o valor 2:");
        int valor2 = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        return new RequestDTO(opcao, valor1, valor2);
    }

    public void showResults(ResponseDTO responseDTO) {
        System.out.println("Resultado: " + responseDTO.getResult());
    }

    public String showReturn() {
        System.out.println("Deseja realizar outra operação? (s/n):");
        return scanner.nextLine();
    }
}
