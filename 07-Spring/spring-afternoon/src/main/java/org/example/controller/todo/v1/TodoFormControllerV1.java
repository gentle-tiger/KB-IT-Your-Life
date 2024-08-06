package org.example.controller.todo.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class TodoFormControllerV1 {
    @GetMapping("/todo/form")
    public String process() {
        log.info("##### todoForm,  /todo/form #####");
        return "todo-form";
    }
}
