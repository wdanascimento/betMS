package br.com.betMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.betMS.model.Concurso;

@Repository
public interface ConcursoRepository extends CrudRepository<Concurso, Long> {
}