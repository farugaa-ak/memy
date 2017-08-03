package com.example.memy.controller;

import com.example.memy.ArticleDao.GifDaoImpl;
import com.example.memy.Model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GifController {
    GifDaoImpl gifDaoImpl=new GifDaoImpl();
    @GetMapping("/")
    public String home(ModelMap modelMap){

        modelMap.addAttribute("gifs", gifDaoImpl.allGifs());
        return "home";
    }
    @GetMapping("/gif/{name}")
    public String display(@PathVariable String name, @ModelAttribute Gif gif, ModelMap modelMap){

        modelMap.addAttribute("allgifs",gifDaoImpl.allGifs());
        return ("gif-details");
    }
    @GetMapping("/favorites")
    public String showFavorites(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifDaoImpl.findFavourites());
    return ("favorites");
    }
    @GetMapping("/gifs/search")
    public String result(@RequestParam String q, ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDaoImpl.findByName(q));
        return "home";
    }
}
