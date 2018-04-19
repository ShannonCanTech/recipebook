package com.example.recipebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showIndex()
    {
        return "index";
    }
}
