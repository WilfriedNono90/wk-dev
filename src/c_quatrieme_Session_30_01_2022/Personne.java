package c_quatrieme_Session_30_01_2022;

public abstract class Personne {

    private int age;
    private String nom;
    private String prenom;

    public Personne(int age, String nom, String prenom) {
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne() {

    }

    public abstract String getVollnameUndAge();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public PuissanceMotdePasse getPuissance (String motdePasse) {
        //nombre de traitement

        return PuissanceMotdePasse.BAS;
    }
}
