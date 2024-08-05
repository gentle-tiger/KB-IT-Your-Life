package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    // 특정 주소에 대해 맵핑 (getMapping)
    @GetMapping("/")
    public String home() { // 기능이 있는 메서드는 process 라고 부른다?
        log.info("#### HomeController, /");
        return "index"; // 리턴값은 파일명을 말한다.
    }
}
