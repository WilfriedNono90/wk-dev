package wk_dev_workshop.userService;

import java.util.HashMap;

public class User {
    //WD-1 :mettre les attributs prive;
    //WD-1 : ajouter un attribut id
    String nom, prenom, ville;
    int age;
    String adresse1;
    int plz;
    String email;
    private String role ;
    //WD-1 : quelle est la difference entre adresse1 et adresse
    HashMap<String, String> adresse = new HashMap<>();

    public User(String nom, String prenom, String email, String ville, int age, String adresse1, int plz) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse1 = adresse1;
        this.ville = ville;
        this.plz = plz;
        this.age = age;
        this.email = email;
    }

    //WD-1 : creer un constructeur sans parametrexxxyxycyxcx


    //Creer les getter et les setter pour tous les attributs


    public int getPlz(){
        return 0;
    }
    public void setPlz(int plz){

        this.plz = plz;
    }

}
