package pl.akademiakodu.memy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Category {

    private Integer id;
    private String name;
    private List<Gif> gifs = new ArrayList<>();

    public Category() {
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Gif> getGifs() {
        return gifs;
    }

    public void setGifs(List<Gif> gifs) {
        this.gifs = gifs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGifsToCattegory(Gif gif) {
        gifs.add(gif);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(name, category.name) &&
                Objects.equals(gifs, category.gifs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gifs);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gifs=" + gifs +
                '}';
    }
}
