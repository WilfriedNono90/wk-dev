package wk_dev_workshop.userService;

import java.util.HashMap;

public class User {
    String nom, prenom, ville;
    int age;
    String adresse1;
    int plz;
    String email;

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


    public int getPlz(){
        return 0;
    }
    public void setPlz(int plz){

        this.plz = plz;
    }

}
