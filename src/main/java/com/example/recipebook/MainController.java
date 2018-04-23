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

    @RequestMapping("/recipes")
    public String showRecipes()
    {
        return "recipelist";
    }

    @RequestMapping("/wings")
    public String wingsRecipe()
    {
        return "wings";
    }


}
