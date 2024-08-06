package org.example.controller.todo.v1;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoShowControllerV1 {
    // 유일한 객체를 끌어오는 것임
    private TodoDtoListV1 todoDtoList = TodoDtoListV1.getInstance();

    // /todo 와 todo는 다른 것이다. (/todo -> 절대 경로 필수)
    @GetMapping("/todo/show")
    public String process(HttpServletRequest req) {
        log.info("#### todoShow #### /todo/show");
        req.setAttribute("todoList", todoDtoList.getList());

        return "todo-show";
    }

}
