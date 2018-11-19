package me.ermias.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/home", method =
    RequestMethod.GET)
    public String getHomePage(){
        return "index";
    }
}
