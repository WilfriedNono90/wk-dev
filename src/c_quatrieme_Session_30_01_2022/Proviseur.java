package c_quatrieme_Session_30_01_2022;

public class Proviseur extends Personne implements Comportement {

    private String parkplatzNr;


    public Proviseur(int age, String nom, String prenom) {
        super(age, nom, prenom);
    }

    public Proviseur() {

    }

    @Override
    public String getVollnameUndAge() {
        return super.getNom()+" "+super.getPrenom()+" "+super.getAge();
    }


    @Override
    public void macher(int numerodeCarte) {

    }

    @Override
    public void sauter() {

    }

    @Override
    public void attaquer() {

    }
}

