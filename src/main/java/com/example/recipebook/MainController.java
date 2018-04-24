package com.example.recipebook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showIndex(Model model)
    {
        model.addAttribute("menu", "home");
        return "index";
    }

    @RequestMapping("/recipes")
    public String showRecipes(Model model)
    {
        model.addAttribute("menu", "recipes");
        return "recipelist";
    }

    @RequestMapping("/recipes/wings")
    public String wingsRecipe(Model model)
    {
        model.addAttribute("menu", "/recipes/wings");
        return "/recipes/wings";
    }

    @RequestMapping("/recipes/injera")
    public String injeraRecipe(Model model)
    {
        model.addAttribute("menu", "/recipes/injera");
        return "/recipes/injera";
    }

    @RequestMapping("/recipes/pumpkinricenoodles")
    public String pRNRecipe(Model model)
    {
        model.addAttribute("menu", "/recipes/pumpkinricenoodles");
        return "/recipes/pumpkinricenoodles";
    }

}
