package org.example.controller.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.post.PostDto;
import org.example.dto.post.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/post/v2/rest")
public class RestPostControllerV2 {
    private final PostRepository postRepository;
    private String context = "/post/v1";


    // 게시글 목록
    @GetMapping("/show")
    public ResponseEntity<List<PostDto>> postList(HttpServletRequest request, Model model) {
        log.info("-----> 게시글 목록 페이지 호출 , " + request.getRequestURI());
        List<PostDto> list = postRepository.findAll();
        return ResponseEntity.ok(list);  // ok : 200
    }

    @GetMapping(value = "/test", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> test() {

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("요청을 처리할 수 없습니다."); // HttpStatus
        // 가능 상태 코드:
        // HttpStatus.NOT_FOUND (404)
        // HttpStatus.BAD_REQUEST (400)
        // HttpStatus.INTERNAL_SERVER_ERROR (500) 등
    }


    // 게시글 검색
    @GetMapping("/search")
    // 파일명이 아닌 게시글 배열을 리턴해야 하므로 메서드의 리턴 타입을 변경.
    public List<PostDto> postSearch(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            HttpServletRequest request,
            Model model
    ) {
        log.info("---------->개시글 검색 기능 호출  : " + request.getRequestURI());

        // 배열 데이터를 스프링이 알아서 JSON 으로 변환함.
        return postRepository.findByCondition(title, content);
    }

    // 게시글 삭제
    // RequestParam 자동 형변환
    // Long으로 받아서 body로 반환한다.
    @DeleteMapping(value = "/delete/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> postDelete(@PathVariable("id") Long id, HttpServletRequest request) {
        log.info("------------> 게시글 삭제 기능 호출 : " + request.getRequestURI());

        int affectedRows = postRepository.delete(id);

        if (affectedRows > 0) {
            return ResponseEntity.ok("삭제 성공");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("요청을 처리할 수 없습니다."); // 404
        }
    }


}
