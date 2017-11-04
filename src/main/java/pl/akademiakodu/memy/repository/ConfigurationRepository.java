package pl.akademiakodu.memy.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import pl.akademiakodu.memy.model.Category;
import pl.akademiakodu.memy.model.Gif;

import javax.annotation.PostConstruct;

@Configuration
public class ConfigurationRepository {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @PostConstruct
    public void setupCategories() {
        categoryRepository.add(new Category(1, "mems"));
        categoryRepository.add(new Category(2, "android"));
        categoryRepository.add(new Category(3, "sport"));
        categoryRepository.add(new Category(4, "funny"));
    }

    @PostConstruct
    public void setupGifRepository() {
        gifRepository.add(new Gif("android-explosion", true, "User1", categoryRepository.findByName("mems")));
        gifRepository.add(new Gif("ben-and-mike", false, "User2", categoryRepository.findByName("sport")));
        gifRepository.add(new Gif("book-dominos", false, "User3", categoryRepository.findByName("funny")));
        gifRepository.add(new Gif("compiler-bot", false, "User4", categoryRepository.findByName("mems")));
        gifRepository.add(new Gif("cowboy-coder", false, "User5", categoryRepository.findByName("funny")));
        gifRepository.add(new Gif("infinite-andrew", true, "User6", categoryRepository.findByName("sport")));
    }
}
