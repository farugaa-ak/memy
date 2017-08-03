package com.example.memy.ArticleDao;

import com.example.memy.Model.Category;
import com.example.memy.Model.Gif;

import java.util.ArrayList;
import java.util.List;


public class CategoryDaoImpl {
    private static List<Category> categoryList = new ArrayList<>();
    private GifDaoImpl gifDao= new GifDaoImpl();
    static {
        categoryList.add(new Category(1L,"Painted"));
        categoryList.add(new Category(2L,"Realistic"));
        categoryList.add(new Category(3L, "Amazing"));
    }

    public List<Category> findAll(){
        return categoryList;
    }

    public Category gifsInCategory(Long id){

        if (id==categoryList.get(0).getId()) {
            categoryList.get(0).addGifsToCattegory(gifDao.allGifs().get(2));
            categoryList.get(0).addGifsToCattegory(gifDao.allGifs().get(3));
            categoryList.get(0).addGifsToCattegory(gifDao.allGifs().get(4));
            return categoryList.get(0);
        }else if (id==categoryList.get(1).getId()) {
            categoryList.get(1).addGifsToCattegory(gifDao.allGifs().get(0));
            categoryList.get(1).addGifsToCattegory(gifDao.allGifs().get(1));
            categoryList.get(1).addGifsToCattegory(gifDao.allGifs().get(5));
            return categoryList.get(1);
        }else {
            categoryList.get(2).addGifsToCattegory(gifDao.allGifs().get(0));
            categoryList.get(2).addGifsToCattegory(gifDao.allGifs().get(5));
            return categoryList.get(2);
        }
    }
}
