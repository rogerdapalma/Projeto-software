package com.example.CRUD.Repository;

import com.example.CRUD.Model.Tarefa;
import org.springframework.data.repository.CrudRepository;

public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {

}
