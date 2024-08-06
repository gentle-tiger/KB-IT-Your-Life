package org.example.controller.todo.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class TodoFormControllerV2 {
    @GetMapping("/todo/v2/form")
    public String process() {
        log.info("##### todoForm,  /todo/v2/form #####");
        return "todo-form2";
    }
}
