package org.example.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/ex2")
public class Ex2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
        Boolean randBoolean = new Random().nextBoolean();

        request.setAttribute("condition",randBoolean);
        request.setAttribute("msg1", "럭키비키!");
        request.setAttribute("msg2", "내일은 럭키비키!");

        //
        List<String> lunchList =new ArrayList<>();
        lunchList.add("한");
        lunchList.add("중");
        lunchList.add("일");
        request.setAttribute("lunchList", lunchList);

        // ex2.jsp 파일 서빙
        request.getRequestDispatcher("ex2.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}