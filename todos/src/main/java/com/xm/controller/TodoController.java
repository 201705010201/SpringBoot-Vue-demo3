package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xm.pojo.Todo;
import com.xm.mapper.TodoMapper;

@CrossOrigin
@RestController
public class TodoController {
    @Autowired
    private TodoMapper todoMapper;

    /**
     * 查询
     *
     * @return
     */
    @GetMapping("/select")
    public List<Todo> todoslist() {
        List<Todo> todos = todoMapper.selectTodos();
        return todos;
    }

    /**
     * 录入
     *
     * @param todo
     * @return
     */
    @PostMapping("/insert")
    public String insert(@RequestBody Todo todo) {
        todoMapper.saveTodo(todo);
        Integer id = todo.getId();//回传的id
        return "{\"id\":\"" + id + "\"}";
    }

    /**
     * 修改
     *
     * @param todo
     * @return
     */
    @PutMapping("/update")
    public String modify(@RequestBody Todo todo) {
        Integer rows = todoMapper.modifyTodo(todo);//返回修改记录数
        return "{\"rows\":\"" + rows + "\"}";
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public String remove(@PathVariable("id") int id) {
        Integer row = todoMapper.removeTodo(id);
        return "{\"row\":\"" + row + "\"}";
    }

    /**
     * 删除done
     * @return
     */
    @DeleteMapping("/deleteDone")
    public String removeDone() {
        Integer rows = todoMapper.removeDone();
        return "{\"rows\":\"" + rows + "\"}";
    }

}
