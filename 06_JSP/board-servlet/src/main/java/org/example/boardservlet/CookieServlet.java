package org.example.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/setCookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        // 쿠키 생성
        Cookie userCookie = new Cookie("username", "gentle");
//        userCookie.setMaxAge(60 * 60 * 24); // 자바의 cookie는 초단위로 들어간다.
        userCookie.setMaxAge(7); // 7초
        response.addCookie(userCookie);




        PrintWriter out = response.getWriter(); // 쿠키가 묻어서 나감.
        out.println("<html><body>");
        out.println("<h1>쿠키가 생성되었습니다!</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}