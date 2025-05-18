package com.usta.hola_mundo_dockerizado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HolaMundoController {

        @GetMapping
        public String helloWorld() {
            return "Hello World!";
        }
}

