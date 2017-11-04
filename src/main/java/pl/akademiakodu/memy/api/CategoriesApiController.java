package pl.akademiakodu.memy.api;

import pl.akademiakodu.memy.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.memy.repository.CategoryRepository;

import java.util.List;

@RestController
public class CategoriesApiController {

    @Autowired
    CategoryRepository categoryRepository;


    @GetMapping("/api/categories")
    public List<Category> listCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/api/categories/{id}")
    public Category listCategories(@PathVariable Integer id){
        return categoryRepository.getCategory(id);
    }
}
