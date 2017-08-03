package com.example.memy.ArticleDao;

import com.example.memy.Model.Gif;

import java.util.List;


public interface GifDao {
    List<Gif> allGifs();

    List<Gif> findFavourites();

    List<Gif> findByName(String name);
}
