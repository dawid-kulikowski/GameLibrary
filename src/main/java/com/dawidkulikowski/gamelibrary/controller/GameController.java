package com.dawidkulikowski.gamelibrary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GameController {

    @RequestMapping("/")
    public String home() {

    return "home.jsp";
}

}
