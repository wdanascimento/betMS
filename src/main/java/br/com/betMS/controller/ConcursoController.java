package br.com.betMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.betMS.dto.ConcursoDTO;
import br.com.betMS.dto.ConcursoRespostaDTO;
import br.com.betMS.model.Concurso;
import br.com.betMS.services.ConcursoService;

@RequestMapping("/concurso")
@RestController
public class ConcursoController {

    private final ConcursoService concursoService;

    @Autowired
    public ConcursoController(ConcursoService concursoService) {
        this.concursoService = concursoService;
    }

    @PostMapping
    public ResponseEntity<ConcursoRespostaDTO> salvar(@RequestBody ConcursoDTO dto) {
        Concurso concurso = concursoService.salvar(dto.transformaParaObjeto());
        return new ResponseEntity<>(ConcursoRespostaDTO.transformaEmDTO(concurso), HttpStatus.CREATED);
    }
}