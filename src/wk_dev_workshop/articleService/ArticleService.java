package wk_dev_workshop.articleService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArticleService {

    private HashMap<Article,Long> stockArticle = new HashMap<>();

    public boolean diminuerLeStock(String idArticle, Long menge) {

        Optional<Article> optionalArticle = findArticleById(idArticle);

        if ( optionalArticle.isPresent() ){
            Long mengeArticle = stockArticle.get( optionalArticle.get() );
            if (mengeArticle < menge) {
                System.out.println("Menge überschritten");
                return false;
            } else  {
                stockArticle.put(optionalArticle.get(), mengeArticle - menge);
                return true;
            }

        } else {
            System.out.println("Article Not Found");
            return false;
        }
    }

    public Optional<Article> findArticleById(String idArticle) {

        /*for (Map.Entry<Article,Long> line : stockArticle.entrySet()) {
            if (line.getKey().getIdArticle().equals(idArticle)) {
                return Optional.of(line.getKey());
            }
        }

        return Optional.empty();*/
        stockArticle.keySet();

        List<Article> articles = stockArticle.entrySet()
                .stream()
                .filter(line -> line.getKey().getIdArticle().equals(idArticle))
                .map(line -> line.getKey())
                .collect(Collectors.toList());

        /*if ( articles.isEmpty() ) {
            return Optional.empty();
        } else {
            return Optional.of(articles.get(0));
        }*/

        return  articles.isEmpty() ? Optional.empty() : Optional.of(articles.get(0));


    }

    public boolean augmenterLestock(String idArticle, Long menge) {
        Optional<Article> articleOptional = findArticleById(idArticle);
        if (articleOptional.isPresent()) {
            stockArticle.put( articleOptional.get(), stockArticle.get(articleOptional.get()) + menge );
            return false;
        } else {
            System.out.println("Article with ID "+idArticle+" not found");
            return false;
        }
    }
}
