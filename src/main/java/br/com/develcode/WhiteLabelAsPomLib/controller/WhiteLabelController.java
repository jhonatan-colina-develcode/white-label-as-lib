package br.com.develcode.WhiteLabelAsPomLib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test3")
public class WhiteLabelController {

    @GetMapping
    public String index() {
        return "Hello World v1!";
    }
}
