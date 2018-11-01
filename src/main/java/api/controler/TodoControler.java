package api.controler;

import api.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import api.repository.TodosRep;

import java.util.List;

@RestController
@RequestMapping ("/todos")
public class TodoControler {

    private TodosRep todosRep;

    @Autowired
    public TodoControler(TodosRep todosRep) {
        this.todosRep = todosRep;

    }
    @GetMapping(value = "/all")
    public @ResponseBody List<Todo> getAllTodos() {
        return this.todosRep.findAll();
    }
    @GetMapping("/{todoId}")
    public @ResponseBody Todo getById(@PathVariable(value = "todoId") Integer todoId) {
        return this.todosRep.findOne(todoId);
    }

}
