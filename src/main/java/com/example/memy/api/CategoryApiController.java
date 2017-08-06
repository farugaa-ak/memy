package com.example.memy.api;

import com.example.memy.ArticleDao.CategoryDaoImpl;
import com.example.memy.Model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Qbala on 2017-08-06.
 */
@RestController
public class CategoryApiController {

    @GetMapping("/api/categories/{id}")
    public Category listCategories(@PathVariable Long id){
        CategoryDaoImpl categoryDaoImpl = new CategoryDaoImpl();
        return categoryDaoImpl.getCategory(id);
    }
}
