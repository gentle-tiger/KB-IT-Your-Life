package org.example.boardservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ex1")
public class Ex1Servlet extends HttpServlet {
     // request 는 바로 쓰면 된다, session은 불러온 후 쓰면 된다, context는 ~ 쓰면 된다./
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Request scope
        request.setAttribute("msg1", "안녕하세요");

        // session scope
        HttpSession session = request.getSession();
        session.setAttribute("msg2", "하늘 맑음");

        // application scope
        ServletContext context = getServletContext();
        context.setAttribute("msg3", "럭키비키");


        // scope.jsp 파일로 이동
        request.getRequestDispatcher("/ex1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}