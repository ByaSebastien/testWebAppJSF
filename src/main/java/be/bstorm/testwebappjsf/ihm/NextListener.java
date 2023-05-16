//package be.bstorm.testwebappjsf.ihm;
//
//import jakarta.enterprise.context.SessionScoped;
//import jakarta.faces.event.AbortProcessingException;
//import jakarta.faces.event.ActionEvent;
//import jakarta.faces.event.ActionListener;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//
//import java.io.Serializable;
//
//
//
//@Named
//@SessionScoped
//public class NextListener implements Serializable, ActionListener {
//
//    private static final long serialVersionUID = -7752358388239085979L;
//
//    @Inject
//    private CatalogBrowserBean catalogBrowserBean;
//
//
//    @Override
//    public void processAction( ActionEvent event ) throws AbortProcessingException {
//        catalogBrowserBean.setIndex( catalogBrowserBean.getIndex() + 1 );
//    }
//
//}