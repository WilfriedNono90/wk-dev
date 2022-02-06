package c_quatrieme_Session_30_01_2022;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.io.FileNotFoundException;
import java.util.HashSet;

public class OrienteObjet {

    public static void main(String[] args) {
        //etudiant est un objet, l'instance de la classe Etudiant
        Etudiant etudiant = new Etudiant(25, "steve", "franc");
        Etudiant etudiant_laura = new Etudiant(25, "laura", "nelly");
        etudiant.getVollnameUndAge();

        Modification modification1 = new Modification();
        Modification modification2 = new Modification();

        modification2.setNumber(15);

        System.out.println("Afficher number : "+modification1.getNumber());
        System.out.println(Modification.getNumber());



        int a = 25;
        //
        Modification.changeValue(a);

        System.out.println(a);


        // notion de reference d'un objet

        Modification.modifyName(etudiant_laura);

        System.out.println(etudiant_laura.getNom());


        // herite de Personne et implemente Comportement
        Proviseur proviseur = new Proviseur();

        proviseur.setAge(15);
        System.out.println("Proviseur "+proviseur.getAge());

        HashSet<Etudiant> datenbank = new HashSet<>();
        datenbank.add(etudiant);
        datenbank.add(etudiant_laura);



        etudiant.setAge(12);

        datenbank.stream().forEach(p -> System.out.println(p.getVollName()));

        //try catch
        int diviseur = 12; int dividende = 0;
        try {
            //xxxxxx
            System.out.println(diviseur / dividende);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Erreur");
        }

        System.out.println("Fin du software");
    }
}
