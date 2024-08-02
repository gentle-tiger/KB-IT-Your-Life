package org.example.repository.book.jpa;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

// 리포지토리의 기본적인 어노테이션
@Slf4j
@RequiredArgsConstructor
@Transactional
@Repository
public class JpaBookRepository {

    // 원래는 매퍼를 사용했음
    private final EntityManager em;

    public List<Book> findAll() {
        String jpql = "SELECT b FROM Book b";
        List<Book> bookList = em.createQuery(jpql, Book.class).getResultList();
        return bookList;

    }

    public Book findById(Long id) {
        return em.find(Book.class, id);
    }

    public Book save(Book newBook) {
        em.persist(newBook);
        return newBook;
    }

    public void delete(Long id) {
        Book book = em.find(Book.class, id);
        if(book != null) em.remove(book);
    }




}















