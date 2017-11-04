package pl.akademiakodu.memy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.memy.repository.CategoryRepository;
import pl.akademiakodu.memy.repository.GifRepository;


@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/categories")
    public String article(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryRepository.findAll());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String display(@PathVariable int id, ModelMap modelMap) {
        modelMap.addAttribute("category", categoryRepository.getCategory(id));
        modelMap.addAttribute("gifs", gifRepository.gifsInCategory(id));
        return ("category");
    }

    @GetMapping("/category/search")
    public String result(@RequestParam String q, ModelMap modelMap) {
        modelMap.addAttribute("category", categoryRepository.findByName(q));
        modelMap.addAttribute("gifs", gifRepository.gifsInCategory(q));
        return "category";
    }
}
