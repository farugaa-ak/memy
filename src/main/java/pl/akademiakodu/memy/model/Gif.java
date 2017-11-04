package pl.akademiakodu.memy.model;

import java.util.Objects;


public class Gif {

    private String name;
    private boolean favorite;
    private String userName;
    private Category category;

    public String getUserName() {
        return userName;
    }

    public Gif(String name, boolean favorite, String userName, Category category) {
        this.name = name;
        this.favorite = favorite;
        this.userName = userName;
        this.category = category;
    }

    public Gif(String name, boolean favorite, String userName) {
        this.name = name;
        this.favorite = favorite;
        this.userName = userName;
    }

    public Gif() {
    }

    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }

    public Gif(String name, boolean favorite, Category category) {
        this.name = name;
        this.favorite = favorite;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gif gif = (Gif) o;
        return favorite == gif.favorite &&
                Objects.equals(name, gif.name) &&
                Objects.equals(userName, gif.userName) &&
                Objects.equals(category, gif.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, favorite, userName, category);
    }

    @Override
    public String toString() {
        return "Gif{" +
                "name='" + name + '\'' +
                ", favorite=" + favorite +
                ", userName='" + userName + '\'' +
                ", category=" + category +
                '}';
    }
}
