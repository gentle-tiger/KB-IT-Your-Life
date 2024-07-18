package org.scoula.example.user2;

import org.scoula.example.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

// 특정 데이터베이스만을 통신하기 때문에 이렇게 하는 것..?
// 이렇게가 뭐지.
public class UserDAO {

    // 정보를 가지고 있다.
    private final Connection conn;

    public UserDAO() {
        this.conn = JDBCUtil.getConnection();
    }

    public void addUser(UserVO newUser) {

        String sql = "INSERT INTO user_table (userid, name, password, age, membership) VALUES (?,?,?,?,?)";

        // 쿼리 날리기
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newUser.getUserid()); // id는 문자열이라서 setString()
            pstmt.setString(2, newUser.getName()); // name는 문자열이라서 setString()
            pstmt.setString(3, newUser.getPassword()); // password는 문자열이라서 setString()
            pstmt.setInt(4, newUser.getAge());
            pstmt.setBoolean(5, newUser.isMembership());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        System.out.println("회원이 성공적으로 추가 되었습니다!");
    }



    // 회원 목록 조회
    public void getAllUsers() {
        String sql = "SELECT * FROM user_table";// 중요
        //
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ArrayList<UserVO> users = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String userid = rs.getString("userid");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                boolean membership = rs.getBoolean("membership");
                Timestamp signup = rs.getTimestamp("signup_date");

                UserVO user = new UserVO(id, userid, name, password, age, membership, signup);

                users.add(user);
            }

            // 람다식
            users.forEach(user -> System.out.println(user)); // User.java의 toString()과 동일한 작업임.
            // users.forEach(System.out::println); // 위 코드와 동일


        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}

