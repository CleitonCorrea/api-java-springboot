package com.dmvinformatica.api.servicos.facade;

import com.dmvinformatica.api.servicos.dto.ServicoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
public class ServicoFacade {
    private static final Map<Long, ServicoDto> servicos = new HashMap<>();

    public ServicoDto criar(ServicoDto servicoDto){
        long proximoId = servicos.keySet().size() + 1;
        servicoDto.setId(proximoId);
        servicos.put(proximoId, servicoDto);
        return servicoDto;
    }

    public ServicoDto atualizar(ServicoDto servicoDto, Long servicoId){
        servicos.put(servicoId, servicoDto);
        return servicoDto;

    }

    public ServicoDto getId(Long servicoId){
        return servicos.get(servicoId);
    }
    public List<ServicoDto> getAll(){
        return new ArrayList<>(servicos.values());
    }

    public String delete(Long servicoId){

        servicos.remove(servicoId);
        return "Registro Deletado";

    }
}
