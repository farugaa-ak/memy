package com.example.memy.ArticleDao;

import com.example.memy.Model.Gif;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class GifDaoImpl implements GifDao {

    private static List<Gif> gifList = new ArrayList<>();

    static {
        gifList.add(new Gif("android-explosion", true));
        gifList.add(new Gif("ben-and-mike", false));
        gifList.add(new Gif("book-dominos", false));
        gifList.add(new Gif("compiler-bot", true));
        gifList.add(new Gif("cowboy-coder", false));
        gifList.add(new Gif("infinite-andrew", false));

    }

    public List<Gif> allGifs() {
        return gifList;
    }

    @Override
    public List<Gif> findFavourites() {
        List<Gif> favouritesGifs = new ArrayList<>();
        for (int i = 0; i < gifList.size(); i++) {
            if (gifList.get(i).getFavorite() == true) {
                favouritesGifs.add(gifList.get(i));
            }

        }
        return favouritesGifs;
    }

    @Override
    public List<Gif> findByName(String name) {
        List<Gif> result = new ArrayList<>();
        for (Gif gif : gifList) {
            if (gif.getName().equals(name)) {
                result.add(gif);
            }
        }
        return result;

    }
}
