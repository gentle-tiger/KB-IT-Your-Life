package org.scoula.example.todo2;

import org.scoula.example.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    // 클래스에서 connection을 포함하도록 한다.
    private final Connection conn;

    // 접속정보를 가지고 있는 것과 같아진다.
    public UserDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }


    @Override
    public UserVo loginUser(String userId, String password) {
        // user_id 와 password 둘 다 통과해야 한다.
        String sql = "SELECT * FROM todo_user WHERE user_id=? AND password=?";
        UserVo loginUser = null;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // 매개변수로 들어온 값을 ?에 값을 넣어준다.
            pstmt.setString(1, userId);
            pstmt.setString(2, password);
            //executeQuery() 메서드가 실제로 데이터베이스에 값으 전달하는 코드이다.
            try (ResultSet rs = pstmt.executeQuery()) {
                // 관례적으로 while 문을 주로 사용한다.
                while (rs.next()) {
                    loginUser = new UserVo(
                                rs.getString("user_id"),
                                rs.getString("name"),
                                rs.getString("password"),
                                rs.getTimestamp("created_at")
                        );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error connecting to the database", e);
        }
        return loginUser;
    }
}
