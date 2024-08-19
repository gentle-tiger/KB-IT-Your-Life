package org.example.controller.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.post.PostDto;
import org.example.dto.post.PostRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins  = "http://localhost:5173")
@RequestMapping("/post/v1/rest") // 최초 컨텍스트로 /post/v1/rest 를 지정
public class RestPostController {
    private final PostRepository postRepository;
    private String context = "/post/v1";


    // 게시글 목록
    @GetMapping("/show")
    public List<PostDto> postList(HttpServletRequest request, Model model) {
       log.info("-----> 게시글 목록 페이지 호출 , " + request.getRequestURI());

       return postRepository.findAll(); // @RestController에 의해 return 값이 JSON으로 자동 변환됨.
    }


    // 게시글 검색
    @GetMapping("/search")
    // 파일명이 아닌 게시글 배열을 리턴해야 하므로 메서드의 리턴 타입을 변경.
    public List<PostDto> postSearch(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            HttpServletRequest request,
            Model model
    ){
        log.info("---------->개시글 검색 기능 호출  : " + request.getRequestURI());

        // 배열 데이터를 스프링이 알아서 JSON 으로 변환함.
        return postRepository.findByCondition(title, content);
    }


}
