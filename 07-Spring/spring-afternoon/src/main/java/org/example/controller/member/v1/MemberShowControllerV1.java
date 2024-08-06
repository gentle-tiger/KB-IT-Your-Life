package org.example.controller.member.v1;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class MemberShowControllerV1 {
    private MemberDtoListV1 memberList = MemberDtoListV1.getInstance(); // 바로 불러온다. 공통영역에 있는 것을 불러오는 것.

    @GetMapping("/member/show") // 어노테이션을 통해 GET 방식으로 /member/show 요청을 처리하면,
    public String process(HttpServletRequest req, HttpServletResponse res) { // process 메서드가 호출되며
        log.info("#### 회원 목록 조회 페이지 호출, /member/show ####");// 로깅 메시지를 출력하고,
    //req 스코프
        log.info("Member List: {}", memberList.getList());

        // memberList는 싱글톤 패턴으로 구현된 MemberDtoListV1 클래스의 인스턴스이며, 이를 통해 저장된 회원 목록을 가져옵니다.
        req.setAttribute("memberList", memberList.getList()); // 싱글톤으로 받아온 데이터를 특정 jsp로 전달한다.
        return "member-show";
    }
}
