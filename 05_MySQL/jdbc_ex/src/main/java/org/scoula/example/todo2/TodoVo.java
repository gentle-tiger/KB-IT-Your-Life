package org.scoula.example.todo2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
// TodoVo : TodoList 정보를 관리하는 VO
public class TodoVo {
    private final int id;
    private final String userId;
    private final String todo;
    private final boolean isCompleted;
    private final Timestamp created_at;

}
