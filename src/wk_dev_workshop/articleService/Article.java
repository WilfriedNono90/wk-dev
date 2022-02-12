package wk_dev_workshop.articleService;

import java.util.Date;
import java.util.Objects;

public class Article {
    private  String idArticle;
    private  String nom;
    private String type;
    private String description;
    private Date issueDate;

    public Article(String idArticle, String nom, String type, String description, Date issueDate) {
        this.idArticle = idArticle;
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.issueDate = issueDate;
    }

    public Article(String idArticle, String nom) {
        this.idArticle = idArticle;
        this.nom = nom;
    }

    public Article(String idArticle, String nom, String description) {
        this.idArticle = idArticle;
        this.nom = nom;
        this.description = description;
    }

    public Article() {

    }



    public String getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(String idArticle) {
        this.idArticle = idArticle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(idArticle, article.idArticle) && Objects.equals(nom, article.nom) && Objects.equals(type, article.type) && Objects.equals(description, article.description) && Objects.equals(issueDate, article.issueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, nom, type, description, issueDate);
    }
}
