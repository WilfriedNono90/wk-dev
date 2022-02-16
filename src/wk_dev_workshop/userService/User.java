package wk_dev_workshop.userService;

import java.util.HashMap;

public class User {
    //WD-1 :mettre les attributs prive;
    //WD-1 : ajouter un attribut id
   private String nom, prenom, ville, idUser;
   private int age;
   private String adresse1;
   private int plz;
   private String email;



    public User(String nom, String prenom, String email, String ville, int age, String adresse1, int plz) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.ville = ville;
        this.plz = plz;
        this.age = age;
        this.email = email;
    }

    //WD-1 : creer un constructeur sans parametre

    public User() {
        super();
    }

    //Creer les getter et les setter pour tous les attributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPlz(){

        return 0;
    }
    public void setPlz(int plz){

        this.plz = plz;
    }

}
