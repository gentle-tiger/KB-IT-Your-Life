package org.scoula.example.todo2;

import java.util.List;

// TodoDao : TodoList 구현을 위한 인터페이스
public interface TodoDao {


    int getTotalCount(String user_id);
    void getTodosByUserId(String user_id);
    void getCompletedTodosByUserId(String user_id);
    void getUncompletedTodosUserId(String user_id);
    void makeTodoCompleted(int id, String user_id);
    void createTodo(String todo, String user_id);
    void deleteTodo(int id, String user_id);
    void getAllTodosWithUserName();
}