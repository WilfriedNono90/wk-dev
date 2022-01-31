package b_deuxieme_session_23_01_2022;

import java.util.*;

public class Exercice_niveau2_deviner_mot {

    public static void main(String[] args) {

        // liste des mots et initialiser un dictionaire
        List<String> dictionaire = Arrays.asList("Wilfried","bonjour",
                "bonsoir","nelly","lesly","Cesar","Jacques","blondelle","wendy","Gigi");

        //choisir un mot au hasard
        String mot_magique ;
        double random = Math.random() * 10;
        int index_magique = (int) random;
        mot_magique = dictionaire.get(index_magique);
        int nombre_essai = 10;
        // version up
        //String mot = dictionaire.get((int)Math.random() * 10);

        String mot_saisi;

        //System.out.println(mot_magique);

        do {
            System.out.println("Deviner le Mot");
            Scanner sc = new Scanner(System.in);
            mot_saisi = sc.nextLine();
            if (mot_magique.equals(mot_saisi)) {
                System.out.println("Bravo vous avez trouvez le mot");
                break;
            } else {
                nombre_essai--;
                System.out.println("Desole vous avez rate le mot , il vous reste " + nombre_essai + " essaies");
                for (int i = 0; i < mot_magique.length(); i++) {
                    if(mot_saisi.length() > i) {
                        if (mot_magique.charAt(i) == mot_saisi.charAt(i)) {
                            System.out.print(mot_magique.charAt(i) + "\t");
                        } else {
                            System.out.print("_\t");
                        }
                    }else {
                        System.out.print("_\t");
                    }
                }
                System.out.println();
            }
        }while (nombre_essai > 0);

        System.out.println("Fin de la partie");



    }
}
