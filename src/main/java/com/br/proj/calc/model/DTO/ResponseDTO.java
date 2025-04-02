package com.br.proj.calc.model.DTO;

public class ResponseDTO {
    
    double result;

    public ResponseDTO(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
