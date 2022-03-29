package com.finalproject.todomanagement;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.finalproject.todomanagement.model.Todo;
import com.finalproject.todomanagement.repository.TodoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ToDoManagementApplicationTests {
	
	
	@Autowired
	TodoRepository todoRepository ;
	
	@Test
	void saveTodoTest() {
		Todo todo = new Todo("Akshatha","test",new Date());
		todoRepository.save(todo);
		boolean actualResult = todoRepository.existsById((long) 9);
		Assertions.assertTrue(actualResult);
		
	}
	@Test
	void updateTodoTest() {
		Todo todo = new Todo("Akshatha","project",new Date());
		todoRepository.save(todo);
		boolean actualResult = todoRepository.existsById((long) 9);
		Assertions.assertTrue(actualResult);

	}
	@Test
	void deleteTodoTest() {
		Todo todo = new Todo();
		todoRepository.delete(todo);
		boolean actualResult = todoRepository.existsById((long) 4);
		Assertions.assertTrue(actualResult);
	}
}
