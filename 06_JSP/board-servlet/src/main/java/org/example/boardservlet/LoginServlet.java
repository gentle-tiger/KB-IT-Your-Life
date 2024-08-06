package org.example.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")

// 하나의 구문으로 get post 둘 다 처리
public class LoginServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/board";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "0000";
    private static Connection conn = null;

    // 로그인 페이지로 이동할 때 호출된다.
    // init() 메서드가 실행된 후 doGet() 메서드가 실행된다.
    @Override
    public void init() throws ServletException {
        System.out.println("### init 메서드 호출, 서블릿 초기화 ###");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Class를 불러올 때 예외 처리를 해야한다.
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            System.out.println("### MySQLdd 접속 성공 ###");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }


    // login을 하게 되면 해당 값이 url에 반영된다
    // http://localhost:8080/login?username=123&password=23
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isLoginSuccess = false;

        try {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) { // 로그인이 성공했다.
                        isLoginSuccess = true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        if (isLoginSuccess) {
            // 기존에 request에 있던 값을 httpsession 타입으로 받겠다는 것
            HttpSession session = request.getSession();
            session.setAttribute("username", username); // 세션에 값 저장

            response.sendRedirect("/board");
        } else {
            response.sendRedirect("loginFailed.jsp");
        }
    }

    //
    @Override
    public void destroy() {
        try {
            conn.close();
            System.out.println("###MySQL 접속 종료###");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("### loginservlet destroy 호출 ");

    }

}
