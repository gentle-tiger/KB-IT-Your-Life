package org.example.controller.todo.v2;


import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoSaveControllerV2 {
    private TodoDtoListV2 todoDtoList;

    @Autowired
    public TodoSaveControllerV2(TodoDtoListV2 todoDtoList){
        this.todoDtoList = todoDtoList;
    }

    @RequestMapping(value = "/todo/v2/form/save", method = RequestMethod.GET)
    public String process(HttpServletRequest req) {
        log.info("##### todoSaveProcess #####");

        String todo = req.getParameter("todo");
        todoDtoList.addList(todo);

        // jsp에서 작성한 양식에 맞게 todoList로 반환한다.
        req.setAttribute("todoList", todoDtoList.getList());
        return "todo-show2";
    }
}
