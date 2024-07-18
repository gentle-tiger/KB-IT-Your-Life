package org.scoula.example.todo2;

// UserDao : 사용자 기능 구현을 위한 인터페이스
public interface UserDao {
    UserVo loginUser(String user_id, String password);

}
