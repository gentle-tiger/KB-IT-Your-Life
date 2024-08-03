package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {

    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {

            request.setAttribute("msg","컨트롤러가 전달한 메시지입니다.");
            request.setAttribute("img","https://item.kakaocdn.net/do/cefb8ed496e0541d2a99293a1fa06233ba2da8249bd9ffef143efb890203e009");
        return "about";
    }
}
