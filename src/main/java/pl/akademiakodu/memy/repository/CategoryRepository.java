package pl.akademiakodu.memy.repository;

import org.springframework.stereotype.Repository;
import pl.akademiakodu.memy.model.Category;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CategoryRepository {

    private List<Category> categoryList = new ArrayList<>();

    public void add(Category category) {
        categoryList.add(category);
    }

    public List<Category> findAll() {
        return categoryList;
    }

    public Category getCategory(int id) {
        for (Category category : categoryList) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        return new Category();
    }

    public Category find(int id) {
        for (Category category : categoryList) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        return new Category(); //not found ??
    }

    public Category findByName(String name) {
        for (Category category : categoryList) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return new Category(); //not found ??
    }
}


