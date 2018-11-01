package api.repository;

import api.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRep extends JpaRepository <Todo, Integer> {

}

