package org.scoula.user;

import org.scoula.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class ManageUser {
    public void addUser(User newUser) {
        Connection conn = JDBCUtil.getConnection();


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

    public void deleteUserById(int id) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "DELETE FROM user_table WHERE id = ?"; // 중요

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) { // 고정적으로 작성하는 코드 (중요)
            pstmt.setInt(1, id); // 첫 번쨰 물음 표의 값을 받는다.
            int affectedRows = pstmt.executeUpdate(); // executeUpdate() 메서드는 값을 반환한다.
            // executeUpdate() 메서드
            // -> INSERT, UPDATE, DELETE 문: 데이터베이스에서 데이터를 삽입, 갱신, 삭제하는 데 사용된다.
            // -> executeUpdate() 메서드는 SQL 문이 성공적으로 실행된 후 영향을 받은 행(row)의 개수를 int 타입으로 반환한다.
            // affectedRows()
            if (affectedRows == 0) {
                System.out.printf("ID가 %s인 회원이 존재하지 않습니다.", id);
            } else {
                System.out.printf("ID가 $s인 회원 정보가 성공적으로 제거 되었습니다.", id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    // 회원 목록 조회
    public void getAllUsers() {
        Connection conn = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user_table";// 중요
        //
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ArrayList<User> users = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String userid = rs.getString("userid");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                boolean membership = rs.getBoolean("membetship");
                Timestamp signup = rs.getTimestamp("signup_date");

                User user = new User(id, userid, name, password, age, membership, signup);

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
