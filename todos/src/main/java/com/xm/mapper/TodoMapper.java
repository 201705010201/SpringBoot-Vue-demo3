/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xm.mapper;

import java.util.List;
import com.xm.pojo.Todo;

/**
 *
 * @author chen
 */
public interface TodoMapper {
    //查看
    public  List<Todo> selectTodos();   
    //增加
    public Integer saveTodo(Todo todo);
    //修改
    public Integer modifyTodo(Todo todo);

    //删除
    //请学生完成
    //选中一个删除
    public Integer removeTodo(int id);

    //clear done 删除已经完成的
    public Integer removeDone();

}
