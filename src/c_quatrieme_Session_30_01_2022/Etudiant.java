package c_quatrieme_Session_30_01_2022;

public class Etudiant extends Personne {


    //contructor
    //sans visibite == public
    Etudiant(int age, String nom, String prenomParam) { //parametre
        super(age,nom,prenomParam);
    }

    //constructor
    //polymorphisme
    public Etudiant(String nom, String prenom) {
        super(nom,prenom);
    }

    @Override
    public String getVollnameUndAge() {
        return null;
    }

    public String getVollName() {
        return super.getNom()+" "+super.getPrenom();
    }




}
