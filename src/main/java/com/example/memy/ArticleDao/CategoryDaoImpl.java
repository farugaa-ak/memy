package com.example.memy.ArticleDao;

import com.example.memy.Model.Category;
import com.example.memy.Model.Gif;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slickender on 02.08.2017.
 */
public class CategoryDaoImpl {
    private static List<Category> categoryList = new ArrayList<>();
    private GifDaoImpl gifDao= new GifDaoImpl();
    static {
        categoryList.add(new Category(1L,"Funny"));
        categoryList.add(new Category(2L,"Unrealistic"));
        categoryList.add(new Category(3L, "Amazing"));
    }

    public List<Category> findAll(){
        return categoryList;
    }

    public Category getCategory(Long id){
        if (id==1L){
            return categoryList.get(0);
        }else if (id==2L){
            return categoryList.get(1);
        }else
            return categoryList.get(2);
    }
}
