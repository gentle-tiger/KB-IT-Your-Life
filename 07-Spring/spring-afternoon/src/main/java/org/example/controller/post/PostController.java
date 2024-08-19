package org.example.controller.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.post.PostDto;
import org.example.dto.post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Slf4j
//@RequiredArgsConstructor
@RequestMapping("/post/v1")
public class PostController {
    private final PostRepository postRepository;
    private String context = "/post";

    // @RequiredArgsConstructor 대체 생성자. 옆의 Bean이 붙은것을 보아 해당 생성자에 의존성이 주입된 것으로 볼 수 있다.
    @Autowired // Autowired을 붙여 의존성주입이라는 것을 명시적으로 알려준다.
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 게시글 목록 보기
    @GetMapping("/show")
    public String postList(HttpServletRequest request, Model model) {
        log.info("게시글 목록 페이지 호출 ", request.getRequestURI());

        model.addAttribute("posts", postRepository.findAll());

        List<PostDto> list = postRepository.findAll();
        model.addAttribute("postList", list);

        // post/post-show.jsp
        return context + "/post-show";
    }

    @GetMapping("/search")
    public String postSearch(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            HttpServletRequest request,
            Model model
    ){
        log.info("-----------게시글 검색 기능 호출 " + request.getRequestURI());
        List<PostDto> searchedList = postRepository.findByCondition(title, content);
        model.addAttribute("postList", searchedList);

        return context + "/post-show";
    }
}
