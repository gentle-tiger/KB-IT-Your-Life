package org.example.repository.todo.jpa;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Todo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Repository
public class TodoRepository {

    private final EntityManager em;

    // Todo List 받아오기
    public List<Todo> findAll() {
        String jpql = "SELECT t FROM Todo t";
        List<Todo> todoList = em.createQuery(jpql, Todo.class).getResultList();
        return todoList;
    }

    // id로 Todo찾기
    public Todo findById(Long id) {
        return em.find(Todo.class, id);
    }

    // Todo 추가하기
    public Todo save(Todo newTodo) {
        em.persist(newTodo);
        return newTodo;
    }

    // Todo 완료 여부 변경하기
    public Todo updateDone(Todo findTodo) {
        return em.merge(findTodo);
    }

    // Todo Content 수정하기
    public Todo updateTodo(Todo updateTodo) {
        return em.merge(updateTodo);
    }


    // Todo 삭제하기
    public void delete(Long id) {
        Todo todo = em.find(Todo.class, id);
        if (todo != null) em.remove(todo);
    }
}
