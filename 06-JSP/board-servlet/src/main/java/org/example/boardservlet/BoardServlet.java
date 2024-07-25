package org.example.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/board";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "0000";
    private static Connection conn = null;

    @Override
    public void init() throws ServletException {
        System.out.println("######BoardServlet init() 메서드 호출, 서블릿 초기화######");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Class를 불러올 때 예외 처리를 해야한다.
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            String sql = "SELECT * FROM posts";

            System.out.println("### MySQLdd 접속 성공 ###");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("content"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


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

    @Override
    public void destroy() {
        try {
            conn.close();
            System.out.println("###MySQL 접속 종료###");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("### boardServlet destroy 호출 ");

    }

}