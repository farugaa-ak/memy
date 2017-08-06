package com.example.memy.ArticleDao;

import com.example.memy.Model.Category;
import com.example.memy.Model.Gif;

import java.util.List;


/**
 * Created by Qbala on 02.08.2017.
 */
public interface CategoryDao {

    List<Category> findAll();

    Category getCategory(Long id);

    List<Gif> findByName(String name);
}
