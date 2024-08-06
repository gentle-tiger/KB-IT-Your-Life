package org.example.controller.todo.v1;


import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoSaveControllerV1 {
    private TodoDtoListV1 todoDtoList = TodoDtoListV1.getInstance();

    @RequestMapping(value = "/todo/form/save", method = RequestMethod.GET)
    public String process(HttpServletRequest req) {
        log.info("##### todoSaveProcess #####");

        String todo = req.getParameter("todo");
        todoDtoList.addList(todo);

        // jsp에서 작성한 양식에 맞게 todoList로 반환한다.
        req.setAttribute("todoList", todoDtoList.getList());
        return "todo-show"; // 이거 아닌 거 같은데
    }
}
