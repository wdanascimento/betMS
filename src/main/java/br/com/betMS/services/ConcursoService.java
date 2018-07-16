package br.com.betMS.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.betMS.model.Concurso;
import br.com.betMS.repository.ConcursoRepository;

@Service
public class ConcursoService {

    private final ConcursoRepository concursoRepository;

    @Autowired
    public ConcursoService(ConcursoRepository concursoRepository) {
        this.concursoRepository = concursoRepository;
    }

    public Concurso salvar(Concurso concurso) {
        return concursoRepository.save(concurso);
    }
}