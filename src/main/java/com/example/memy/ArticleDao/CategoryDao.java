package com.example.memy.ArticleDao;

import com.example.memy.Model.Category;
import com.example.memy.Model.Gif;

import java.util.List;


public interface CategoryDao {
    List<Category> findAll();
    Category gifsInCategory(Long id);
}
