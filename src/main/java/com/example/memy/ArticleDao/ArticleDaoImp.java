package com.example.memy.ArticleDao;

import com.example.memy.Model.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImp implements ArticleDao {

    private static List<Article> articles = new ArrayList<>();
    static {
        articles.add(new Article(1,"Article1","Opis1"));
        articles.add(new Article(2,"Article2","Opis2"));
        articles.add(new Article(3,"Article3","Opis3"));
        articles.add(new Article(4,"Article4","Opis4"));
        articles.add(new Article(5,"Article5","Opis5"));

    }

    @Override
    public List<Article> findAll() {
        return articles;
    }
}
