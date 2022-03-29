package com.finalproject.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.finalproject.todomanagement.model.Todo;

public interface ITodoService {

	List<Todo> getTodosByUser(String user);
	
	Optional<Todo> getTodoById(long id);
	
	List<Todo> getTodoOrderByTargetDateAsc();

	void updateTodo(Todo todo);

	void addTodo(String name, String desc, Date targetDate);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}