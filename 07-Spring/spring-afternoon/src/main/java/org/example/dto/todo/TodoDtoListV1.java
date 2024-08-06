package org.example.dto.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDtoListV1 {
    private static TodoDtoListV1 instance; // 왜지
    private List<TodoDto> todoDtoList; // 왜지

    // 생성자
    private TodoDtoListV1() {
        this.todoDtoList = new ArrayList<>(); // List 초기화
        // 테스트 데이터 추가
        this.addList("스프링 정복하기");
        this.addList("코테도 정복하기");
    }

    // 싱글톤 인스턴스 반환 메서드
    public static synchronized TodoDtoListV1 getInstance() {
        if (instance == null) { // 왜 null을 체크하는지 모름
            instance = new TodoDtoListV1();
        }
        return instance;
    }

    public void addList(String todo) {
        todoDtoList.add(new TodoDto(todo));
    }

    public List<TodoDto> getList() {
        return todoDtoList;
    }
}
