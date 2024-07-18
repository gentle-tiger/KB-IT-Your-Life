package org.scoula.example.todo2;


import org.scoula.example.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TodoDaoImpl implements TodoDao {
    private final Connection conn;

    public TodoDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public int getTotalCount(String user_id) {
        String sql = "select count(*) from todo where user_id=?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,user_id);
            try(ResultSet rs = stmt.executeQuery()){
                rs.next();
                return rs.getInt(1);
            }
        }catch(SQLException e){
            e.printStackTrace();

        }
                return 0;
    }


    @Override
    public void getTodosByUserId(String user_id) {

        String sql = "select * from todo where user_id=?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, user_id);
                List<TodoVo> todos = new ArrayList<>();
                try(ResultSet rs = pstmt.executeQuery()){
                    while(rs.next()){
                        int id  = rs.getInt("id");
                        String userId = rs.getString("user_id");
                        String todo = rs.getString("todo");
                        boolean completed = rs.getBoolean("is_completed");
                        Timestamp createdAt = rs.getTimestamp("created_at");

                        TodoVo todoVo = new TodoVo(id, userId, todo, completed, createdAt);
                        todos.add(todoVo);
                    }
                    System.out.println("===== " + user_id + "님의 Todo 전체 목록 =====");
                    if(todos.size() > 0){
                        todos.forEach(todo -> System.out.println(todo));
                    }else{
                        System.out.println("## Todo 목록이 없습니다 ##");
                    }
                }
        }catch(SQLException e){
            // 왜 던질까?
            throw new RuntimeException(e);
        }
    }

        @Override
        public void getCompletedTodosByUserId(String userId) {
            //  user_id 와 is_completed 둘 다 확인
            //  데이터 처리는 DB가 빠르기 때문에 쿼리로 처리하는 게 성능 면에서 가장 좋다.
            String sql = "SELECT * FROM todo WHERE user_id=? AND is_completed=1";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, userId);
                List<TodoVo> completedTodos = new ArrayList<>();
                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String user_id = rs.getString("user_id");
                        String todo = rs.getString("todo");
                        boolean is_completed = rs.getBoolean("is_completed");
                        Timestamp created_at = rs.getTimestamp("created_at");

                        TodoVo todoData = new TodoVo(id, user_id, todo, is_completed, created_at);
                        completedTodos.add(todoData);
                    }

                    System.out.println("===== " + userId + "님의 Todo 완료 목록 =====");
                    if (completedTodos.size() > 0) {
                        completedTodos.forEach((todo) -> System.out.println(todo));
                    } else {
                        System.out.println("## Todo 완료 목록이 없습니다 ##");
                    }

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    @Override
    public void getUncompletedTodosUserId(String user_id) {
        //
        String sql = "SELECT * FROM todo WHERE user_id=? AND is_completed=0";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user_id);
            List<TodoVo> todos = new ArrayList<>();
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userId = rs.getString("user_id");
                    String todo = rs.getString("todo");
                    boolean is_completed = rs.getBoolean("is_completed");
                    Timestamp created_at = rs.getTimestamp("created_at");

                    TodoVo todoData = new TodoVo(id, userId, todo, is_completed, created_at);

                    todos.add(todoData); // list 배열에 추가.
                }
                System.out.println("===== " + user_id + "님의 Todo 미완료 목록 =====");
                if (todos.size() > 0) {
                    todos.forEach((todo) -> System.out.println(todo));
                } else {
                    System.out.println("## Todo 미완료 목록이 없습니다 ##");
                }


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeTodoCompleted(int id, String userId) {
        // todo 테이블에서 id와 user_id가 주어진 값과 일치하는 레코드의 is_completed 값을 TRUE로 업데이트하는 역할
        String sql = "UPDATE todo SET is_completed = TRUE WHERE id = ? AND user_id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, userId);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("## ID 가 " + id + " 인 Todo 가 완료 처리 되었습니다 ##");
            } else {
                System.out.println("## ID 가 " + id + " 인 Todo 는 회원님의 Todo 가 아닙니다 ##");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createTodo(String todo, String userId) {
        //
        String sql = "INSERT INTO todo (user_id, todo) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userId);
            pstmt.setString(2, todo);
            pstmt.executeUpdate();

            System.out.println("## Todo 추가 성공! ##");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTodo(int id, String userId) {
        String sql = "DELETE FROM todo WHERE id = ? AND user_id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, userId);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("## ID 가 " + id + " 인 Todo 가 삭제처리 되었습니다 ##");
            } else {
                System.out.println("## ID 가 " + id + " 인 Todo 는 회원님의 Todo 가 아닙니다 ##");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getAllTodosWithUserName() {
        // user_id 가 같은 애들끼리 묶어서
        String sql = "SELECT t.id, t.user_id, u.name, t.todo, t.is_completed, t.created_at " +
                "FROM todo t " +
                "JOIN todo_user u ON t.user_id = u.user_id " +
                "ORDER BY t.id ASC";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String userId = rs.getString("user_id");
                String userName = rs.getString("name");
                String todo = rs.getString("todo");
                boolean isCompleted = rs.getBoolean("is_completed");
                String createdAt = rs.getTimestamp("created_at").toString();

                System.out.printf("id: %d, user_id: %s, 작성자 이름: %s, todo: %s, is_completed: %b, created_at: %s%n",
                        id, userId, userName, todo, isCompleted, createdAt);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}