package be.bstorm.testwebappjsf.models;

import be.bstorm.testwebappjsf.models.Article;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;


@Named
@ApplicationScoped
public class Catalog {

    private List<Article> articles = new ArrayList<>();
    
    public Catalog() {
        articles.add( new Article( 1, "Drone", "Perroquet", 400 ) );
        articles.add( new Article( 2, "Télévision", "SuperBrand", 350 ) );
        articles.add( new Article( 3, "Souris", "Mulot", 35 ) );
        articles.add( new Article( 4, "Smartphone", "MegaMark", 750 ) );
        articles.add( new Article( 5, "Vacances", "DeRêve", 15_000 ) );
    }
    
    public List<Article> getArticles() {
        return articles;
    }
    
    public int getSize() {
        return articles.size();
    }
    
}