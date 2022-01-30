package c_quatrieme_Session_30_01_2022;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.HashSet;

public class OrienteObjet {

    public static void main(String[] args) {
        //etudiant est un objet, l'instance de la classe Etudiant
        Etudiant etudiant = new Etudiant(25, "steve", "franc");
        Etudiant etudiant_laura = new Etudiant(25, "laura", "nelly");

        Modification modification = new Modification();

        int a = 25;
        //
        modification.changeValue(a);

        System.out.println(a);


        // notion de reference d'un objet

        modification.modifyName(etudiant_laura);

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
    }
}
