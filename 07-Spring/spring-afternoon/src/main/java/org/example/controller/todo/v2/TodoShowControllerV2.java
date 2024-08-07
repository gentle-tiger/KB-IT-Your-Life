package org.example.controller.todo.v2;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoShowControllerV2 {
    // 유일한 객체를 끌어온다
    private TodoDtoListV2 todoDtoList;

    @Autowired // 매개변수의 타입을 찾아서 꺼낸다.
    public TodoShowControllerV2(TodoDtoListV2 todoDtoList) {
        this.todoDtoList = todoDtoList;
    }

    // /todo 와 todo는 다른 것. (/todo -> 절대 경로 필수)
    @GetMapping("/todo/v2/show")
    public String process(Model model) {
        log.info("#### todoShow #### /todo/v2/show");
        model.addAttribute("todoList", todoDtoList.getList());

        return "todo-show2";
    }

}
