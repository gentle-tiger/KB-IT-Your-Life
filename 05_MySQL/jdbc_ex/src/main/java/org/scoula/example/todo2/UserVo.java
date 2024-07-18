package org.scoula.example.todo2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

// UserVo : 사용자 정보를 관리하는 VO
@Data
@AllArgsConstructor
public class UserVo {
    private final String user_id;
    private final String name;
    private final String password;
    private final Timestamp created_at;

}
