package be.bstorm.testwebappjsf.ihm;

import be.bstorm.testwebappjsf.models.Article;
import be.bstorm.testwebappjsf.models.Batch;
import be.bstorm.testwebappjsf.models.Catalog;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.ActionEvent;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CatalogBrowserBean implements Serializable {

    private static final long serialVersionUID = 2729758432756108274L;

    @Inject
    private Catalog catalog;
    private List<Batch> basket = new ArrayList<>();
    private int index;


    public Article getCurrentArticle() {
        return catalog.getArticles().get( index );
    }

    public List<Batch> getBasket() {
        return basket;
    }

    public int getBasketSize() {
        int quantity = 0;
        for( Batch batch : basket ) {
            quantity += batch.getQuantity();
        }
        return quantity;
    }

    // --- Event handler methods ---

    public void processPreviousAction( ActionEvent event ) {
        if ( --index < 0 ) {
            index = catalog.getSize()-1;
        }
    }

    public void processNextAction( ActionEvent event ) {
        if ( ++index >= catalog.getSize() ) {
            index = 0;
        }
    }

    public void processAddAction( ActionEvent event ) {
        for( Batch batch : basket ) {
            if ( batch.getArticle().getIdArticle() == getCurrentArticle().getIdArticle() ) {
                batch.addOne();
                return;
            }
        }
        basket.add( new Batch( getCurrentArticle(), 1 ) );
    }
}