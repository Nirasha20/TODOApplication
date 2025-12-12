package com.example.TODOApplication.Controller;

import com.example.TODOApplication.Service.TODOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TODOController {

    @Autowired
    TODOService todoService;

    @RequestMapping(value="/addtodo", method = RequestMethod.POST)
    @ResponseBody
    public String createTodo(@ModelAttribute Todo todo) {
        todoService.saveTodo(todo);
        return "success";

    }
//    public String updateTodo() {
//
//    }
//    public String deleteTodo() {
//
//    }
//    public String getAllTodo() {
//
//    }
}
