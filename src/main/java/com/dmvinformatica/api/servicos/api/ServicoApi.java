package com.dmvinformatica.api.servicos.api;

import com.dmvinformatica.api.servicos.dto.ServicoDto;
import com.dmvinformatica.api.servicos.facade.ServicoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/servicos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServicoApi {
@Autowired
    private ServicoFacade servicoFacade;

@PostMapping
@ResponseBody
    public ServicoDto criar(@RequestBody ServicoDto servicoDto){
    return servicoFacade.criar(servicoDto);
}

@PutMapping("/{servicoId}")
@ResponseBody
    public ServicoDto atualizar(@PathVariable("servicoId") Long servicoId,
                                @RequestBody ServicoDto servicoDto){
    return servicoFacade.atualizar(servicoDto, servicoId);
}

@GetMapping
@ResponseBody
    public List<ServicoDto> getAll(){
    return servicoFacade.getAll();
}

@DeleteMapping("/{servicoId}")
@ResponseBody

    public String deletar(@PathVariable("servicoId") Long servicoId){
    return servicoFacade.delete(servicoId);

}

    }
