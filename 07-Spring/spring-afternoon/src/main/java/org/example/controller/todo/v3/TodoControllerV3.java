package org.example.controller.todo.v3;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDto;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping(value ="/todo/v3/")
public class TodoControllerV3 {
    private TodoDtoListV2 todoList;

    @Autowired
    public TodoControllerV3(TodoDtoListV2 todoDtoList){
        this.todoList = todoDtoList;
    }

    @GetMapping("/show")
    public String todoShow(Model model){
        log.info("#### todo show ####");
        model.addAttribute("todoList", todoList.getList());

        return "todo-show3";
    }

    @GetMapping("/form")
    public String todoForm(Model model){
        log.info("##### todo Form #####");
        return "todo-form3";
    }

    @PostMapping(value ="/form/save")
    public String todoSave(
            @RequestParam("todo") String todo,
            Model model){

        log.info("##### todo Save #####");

        todoList.addList(todo);

        model.addAttribute("todoList", todoList.getList());

        return "todo-show3";
    }


}
