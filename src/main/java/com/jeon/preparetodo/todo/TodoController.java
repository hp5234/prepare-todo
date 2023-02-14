package com.jeon.preparetodo.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TodoController {

    @GetMapping
    public ResponseEntity<String> getString() {
        return new ResponseEntity<>("To-do Application !", HttpStatus.OK);
    }
}
