package org.example.controller.book;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.BookMybatis;
import org.example.repository.book.mybatis.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor // 의존성 주입으로 생성자가 자동으로 생성됨
@CrossOrigin(origins = "*") // postman 하면 발생하진 않지만 연습겸
@RequestMapping("/book/mybatis")
public class MybatisBookController {
    private final BookRepository bookRepository;

    @GetMapping("/show")
    public ResponseEntity<List<BookMybatis>> findAll() {
        List<BookMybatis> bookList = bookRepository.findAll();

        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/show/{id}") // pathVariable
    public ResponseEntity<BookMybatis> findById(@PathVariable Long id) {
        BookMybatis findBook = bookRepository.findById(id);

        // 얼리 리턴
        if (findBook == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(findBook);
    }

    @PostMapping("/save")
    public ResponseEntity<BookMybatis> save(
            @RequestParam("title") String title,
            @RequestParam("author") String author
    ) {
        BookMybatis newBook = new BookMybatis(null, title, author);
        int affectedRows = bookRepository.save(newBook);

        // 얼리 리턴
        // httpstatus 에서 이미 정해져 있는 숫자에 따라 작성
        if (affectedRows == 0) return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
    }


    @DeleteMapping(value = "/delete/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        int affectedRows = bookRepository.delete(id);

        if (affectedRows == 0) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("게시글 삭제 실패");


        return ResponseEntity.ok("게시글 삭제 성공");
    }
}
