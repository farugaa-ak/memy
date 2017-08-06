package com.example.memy.controller;

import com.example.memy.ArticleDao.CategoryDaoImpl;
import com.example.memy.ArticleDao.GifDaoImpl;
import com.example.memy.Model.Category;
import com.example.memy.Model.Gif;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by slickender on 02.08.2017.
 */
@Controller
public class CategoryController {

    private CategoryDaoImpl categoryDaoImpl = new CategoryDaoImpl();

    @GetMapping("/categories")
    public String article(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryDaoImpl.findAll());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String display(@PathVariable Long id, ModelMap modelMap){
        GifDaoImpl gifDao= new GifDaoImpl();
        modelMap.addAttribute("category", categoryDaoImpl.getCategory(id));
        modelMap.addAttribute("gifs", gifDao.gifsInCategory(id));
        return ("category");
    }
}
