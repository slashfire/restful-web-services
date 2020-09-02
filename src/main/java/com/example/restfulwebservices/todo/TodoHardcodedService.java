package com.example.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter,"Prabhakar","Learn To Sing", new Date(), true ));
		todos.add(new Todo(++idCounter,"Prabhakar","Learn To Dance",new Date(),false));
		todos.add(new Todo(++idCounter,"Prabhakar","Learn To Play Sports",new Date(),false));
	}
	public List<Todo> findAll(){
		return todos;
	}
	public Todo delete (long id) {
		Todo todo = findById(id);
		if(todo == null)
			return null;
		if(todos.remove(todo)) {
			return todo;
		}
		return null;
	}
	Todo findById(long id) {
		// TODO Auto-generated method stub
		for(Todo todo: todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	public Todo save(Todo todo) {
		if(todo.getId()==-1||todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			delete(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
}
