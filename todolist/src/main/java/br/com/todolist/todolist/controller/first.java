package br.com.todolist.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/firstPath")
//http://localhost:8000/firstPath
public class first {
    
    /*
     * GET - Retrieve information
     * POST - Add information
     * PUT - Alter information
     * DELETE - Remove information
     * PATCH - Partially alter information
     */
    @GetMapping("/")
    public String firstMessage(){
        return "Worked";
    }
}


