package org.example.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("board.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // 최상단에 있어야 한다.
        // doPost에서 받는다. // 보낸 정보는 request의 특정 키에 값이 있다.
        String post = request.getParameter("post");

        request.setAttribute("post", post);
        RequestDispatcher dispatcher = request.getRequestDispatcher("boardDetail.jsp"); // 파일에 담아 보낸다.
        dispatcher.forward(request, response);


    }
}