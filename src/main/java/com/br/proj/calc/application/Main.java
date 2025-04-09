package com.br.proj.calc.application;

import com.br.proj.calc.controller.ControllerCalc;
import com.br.proj.calc.model.exception.*;
import com.br.proj.calc.model.DTO.RequestDTO;
import com.br.proj.calc.model.DTO.ResponseDTO;
import com.br.proj.calc.view.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ControllerCalc controllerCalc = new ControllerCalc();
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        boolean continuar = true;

        while (continuar) {
            try {
                menu.show();
                RequestDTO requestDTO = menu.retriveValue();
                ResponseDTO responseDTO = controllerCalc.calcular(requestDTO);
                menu.showResults(responseDTO);

                // Perguntar se o usuário deseja continuar
                String resposta = menu.showReturn();

                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;  // Sai do loop se a resposta não for 's'
                }

            } catch (Exception e) {
                exceptionHandler.handleException(e);
            }
        }

        System.out.println("Encerrando a calculadora...");
    }
}