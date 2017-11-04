package pl.akademiakodu.memy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.memy.model.Gif;
import pl.akademiakodu.memy.repository.GifRepository;


@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.allGifs());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String display(@PathVariable String name, @ModelAttribute Gif gif, ModelMap modelMap) {
        modelMap.addAttribute("gif", gifRepository.findByName(name).get(0));
        return ("gif-details");
    }

    @GetMapping("/favorites")
    public String showFavorites(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.findFavourites());
        return ("favorites");
    }

    @GetMapping("/gifs/search")
    public String result(@RequestParam String q, ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.searchByName(q));
        return "home";
    }
}
