package com.xm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import  com.xm.pojo.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.xm.mapper.TodoMapper;

/**
 *
 * @author chen
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoMapperTest {
    @Autowired
    private TodoMapper todoMapper;
      
    @Test
    public void testSelectTodos(){
        //调用方法
        List<Todo> todos  = todoMapper.selectTodos();
        System.out.println(todos.toString());
    }
        
    @Test
    public void testSaveTodo(){
        // 创建Todo对象
	    Todo todo= new Todo("提交第二周作业",0);
	    // 插入数据
        todoMapper.saveTodo(todo);
        //todo 回传了自动生成的id
        System.out.println(todo.getId());
    }    
    
    @Test
    public void testModifyTodo(){
	    //插入数据
	    Todo todo= new Todo("提交第三周作业",0);
        todoMapper.saveTodo(todo);
        //修改数据
	    todo.setDone(1);
	    // 修改数据
        todoMapper.modifyTodo(todo);
        //todo 回传了自动生成的id
        System.out.println(todo.toString());
    }
    
    @Test
    public void testRemoveTodo(){
	    // 删除数据
        //请学生完成
        Todo todo = new Todo("提交第四周作业", 0);
        todoMapper.saveTodo(todo);
        //删除数据
        todoMapper.removeTodo(todo.getId());
        System.out.println(todo.getId());
    }

    @Test
    public void testRemoveDone() {
        int row = todoMapper.removeDone();
        System.out.println(row);
    }

}
