package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.MemberDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class MemberFormControllerV1 {
    @GetMapping("/member/form") // 어노테이션을 통해 get방식으로 member/form 요청을 처리하면
    public String processForm(HttpServletRequest req, HttpServletResponse res) { // processForm 메서드가 호출되고,
        log.info("### 회원 추가 페이지 호출, /member/form ###");// 이 메서드는 로깅 메시지를 출력하고
        return "member-form"; // member-form 뷰를 반환한다.
    }

}
