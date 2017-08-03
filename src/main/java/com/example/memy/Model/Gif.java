package com.example.memy.Model;

import java.awt.*;


public class Gif {
    private String name;
    private boolean favorite;

    public Gif() {
    }

    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        favorite = favorite;
    }
}
