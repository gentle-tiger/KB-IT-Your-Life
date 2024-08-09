package org.example.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "todo")
public class Todo {
    @Id // 기본키 지정
    // 데이터베이스에 의해 기본 키가 자동으로 증가되도록 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "todo")
    private String todo;

    @Column(name = "done")
    private boolean done = false;

    // 기본 생성자
    public Todo(){}

    // 모든 필드를 포함한 생성자
    public Todo(Long id, String todo, boolean done) {
        this.id = id;
        this.todo = todo;
        this.done = done;
    }
}
