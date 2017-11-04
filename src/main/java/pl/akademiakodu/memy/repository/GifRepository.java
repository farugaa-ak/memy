package pl.akademiakodu.memy.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Component
public class GifRepository {

    private List<Gif> gifs = new ArrayList<>();

    @Autowired
    private CategoryRepository categoryRepository;

    public void add(Gif gif) {
        gifs.add(gif);
    }

    public List<Gif> allGifs() {
        return gifs;
    }

    public List<Gif> gifsInCategory(String name) {
        Category byName = categoryRepository.findByName(name);
        return byName.getGifs();
    }

    public List<Gif> gifsInCategory(int id) {
        Category category = categoryRepository.find(id);
        return category.getGifs();
    }

    public List<Gif> findFavourites() {
        List<Gif> favouritesGifs = new ArrayList<>();
        for (Gif gif : gifs) {
            if (gif.isFavorite()) {
                favouritesGifs.add(gif);
            }
        }
        return favouritesGifs;
    }

    public List<Gif> findByName(String name) {
        List<Gif> result = new ArrayList<>();
        for (Gif gif : gifs) {
            if (gif.getName().equals(name)) {
                result.add(gif);
            }
        }
        return result;
    }

    public List<Gif> searchByName(String name){
        List<Gif> result = new ArrayList<>();
        for (Gif gif : gifs) {
            if (gif.getName().contains(name)) {
                result.add(gif);
            }
        }
        return result;
    }

}






