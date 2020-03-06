
package com.xm.pojo;

public class Todo {
	
    private Integer id;
    private String content;
    private Integer done;

    public Todo() {
    }

    public Todo(String content, Integer done) {
        this.content = content;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDone() {
        return done;
    }

    public void setDone(Integer done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" + "id=" + id + ", content=" + content + ", done=" + done + '}';
    }

  
}
