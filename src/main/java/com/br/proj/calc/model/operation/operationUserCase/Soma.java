package com.br.proj.calc.model.operation.operationUserCase;

import com.br.proj.calc.model.DTO.RequestDTO;
import com.br.proj.calc.model.DTO.ResponseDTO;
import com.br.proj.calc.model.operation.contracts.*;

public class Soma implements IOperacaoStrategy {

   @Override
    public ResponseDTO operar (RequestDTO values) {
        return new ResponseDTO(values.getValue1() + values.getValue2());    
    }
}
