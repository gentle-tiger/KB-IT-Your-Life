package org.scoula.example.user;

import org.scoula.example.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
                System.out.printf("ID가 %s인 회원 정보가 성공적으로 제거 되었습니다.", id);
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
                boolean membership = rs.getBoolean("membership");
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

    // 로그인
    public User loginUser(String userid, String password) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user_table WHERE userid = ? AND password = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userid);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getInt("id"),
                            rs.getString("userid"),
                            rs.getString("name"),
                            rs.getString("password"),
                            rs.getInt("age"),
                            rs.getBoolean("membership"),
                            rs.getTimestamp("signup_date")
                    );
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void logoutUser() {
        System.out.println("User logged out.");
    }

    public void searchUsersByName(String namePart) {
        // 기능을 구현해 주세요

        Connection conn = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user_table WHERE name LIKE ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + namePart + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    User user = new User(
                            rs.getInt("id"),
                            rs.getString("userid"),
                            rs.getString("name"),
                            rs.getString("password"),
                            rs.getInt("age"),
                            rs.getBoolean("membership"),
                            rs.getTimestamp("signup_date")
                    );
                    users.add(user);
                }

                if (users.size() > 0) {
                    users.forEach(System.out::println);
                } else {
                    System.out.println("해당 철자가 포함 된 회원이 존재하지 않습니다.");
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public void updateUserDetails(int id, String newName, String newPassword, int newAge, boolean newMembership) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "UPDATE user_table SET name = ?, password = ?, age = ?, membership = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, newPassword);
            pstmt.setInt(3, newAge);
            pstmt.setBoolean(4, newMembership);
            pstmt.setInt(5, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("ID 가 " + id + " 인 회원 정보가 성공적으로 업데이트 되었습니다.");
            } else {
                System.out.println("ID 가 " + id + " 인 회원이 존재하지 않습니다!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
