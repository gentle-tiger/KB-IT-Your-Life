package org.example.controller.todo;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.Todo;
import org.example.repository.todo.jpa.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // RESTful 컨트롤러로 동작
@Slf4j // 로그 기록을 위한 로거 자동 생성
@RequiredArgsConstructor // final 필드에 대한 생성자 자동 생성
// 해당 클래스 내의 모든 메서드가 데이터베이스 트랜잭션 안에서 실행되도록 한다.
// 만약 트랜잭션 내에서 예외가 발생하면, 해당 트랜잭션에 포함된 모든 데이터베이스 작업이 롤백된다.
@Transactional
@CrossOrigin("*")
@RequestMapping("/") // 기본 URL 경로 설정
public class TodoController {
    private final TodoRepository jpaTodoRepository; // 데이터베이스와의 상호작용 담당
    private String context = "/"; // 뷰 파일의 경로를 문자열로 통일.


    // 게시글 목록 보기 (완)
    @GetMapping("/todo")
    public ResponseEntity<List<Todo>> findAll(){
        List<Todo> todos = jpaTodoRepository.findAll();
        return ResponseEntity.ok(todos);
    }


    // id로 Todo 찾기
    @GetMapping("/todo/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id){
        Todo findTodo = jpaTodoRepository.findById(id);

        if(findTodo == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(findTodo);
    }

    // Todo 추가하기 (완)
    @PostMapping("/todo/{todo}")
    public ResponseEntity<Todo> save(@PathVariable("todo") String todo){
      Todo newTodo = new Todo(null, todo, false);

        Todo addedTodo = jpaTodoRepository.save(newTodo);

        if(addedTodo == null) return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        return ResponseEntity.status(HttpStatus.CREATED).body(addedTodo);

    }
    // todo 수정
    @PutMapping("/todo/update/{id}/{todo}")
    public ResponseEntity<Todo> update(@PathVariable("id") Long id, @PathVariable("todo") String todo){
        Todo updateTodo = new Todo(id, todo, false);
        Todo updatedTodo = jpaTodoRepository.updateTodo(updateTodo);
        if(updatedTodo == null) return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        return ResponseEntity.ok(updatedTodo);
    }



    // todo 완료 여부 변경
    @PutMapping("/todo/{id}")
    public ResponseEntity<Todo> doneTodo(@PathVariable Long id){
        //
        Todo findTodo = jpaTodoRepository.findById(id);
        if(findTodo == null) return ResponseEntity.notFound().build();

        findTodo.setDone(!findTodo.isDone());
        Todo updatedTodo = jpaTodoRepository.updateDone(findTodo);
        return ResponseEntity.ok(updatedTodo);

    }

    // Todo 삭제 (완)
    @DeleteMapping(value = "/todo/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable Long id){
        Todo findTodo = jpaTodoRepository.findById(id);
        if(findTodo == null) return ResponseEntity.notFound().build();
        jpaTodoRepository.delete(id);
        return ResponseEntity.ok("삭제 성공");
    }
}
