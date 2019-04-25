package com.example.travisCiDemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("")
    public ResponseEntity<?> sayHello(@RequestParam(name = "name", defaultValue = "") String temp){
        String msg = "Default User";
        if(temp.length() > 0){
            msg = temp;
        }
        return ResponseEntity.ok("Hello "+msg);
    }
}
