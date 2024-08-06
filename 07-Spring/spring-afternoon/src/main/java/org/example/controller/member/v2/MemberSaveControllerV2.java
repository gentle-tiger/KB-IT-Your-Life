package org.example.controller.member.v2;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j // log 사용
public class MemberSaveControllerV2 {
    private MemberDtoListV2 memberList;

    @Autowired
    public MemberSaveControllerV2(MemberDtoListV2 memberDtoList) {
        this.memberList = memberDtoList;
    }

    @RequestMapping(value = "/member/v2/form/save", method = RequestMethod.GET)
    public String process(HttpServletRequest req, HttpServletResponse res) {
        log.info("##### 회원 추가 Request 호출, /member/v2/form/save #####");
        String id = req.getParameter("id");
        String name = req.getParameter("name");

        memberList.addList(id, name);
        req.setAttribute("memberList", memberList.getList());
        return "member-show2";

    }

}
