package com.platzi.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HiWorldController {

    @GetMapping("/Hi")
    public String greet(){
        return "Nunca pares de aprender!";
    }
}
