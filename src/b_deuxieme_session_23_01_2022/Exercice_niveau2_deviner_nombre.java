package b_deuxieme_session_23_01_2022;

import java.util.Scanner;

public class Exercice_niveau2_deviner_nombre {

    public static void main(String[] args) {
        //generer un nombre entre 0 et 10
        double random = Math.random() * 10;
        int nombre_magique = (int) random;

        int nbre_essai = 10;
        int nbre_saisi;

        do {
            System.out.println("Devinez le nombre");
            Scanner sc = new Scanner(System.in);
            nbre_saisi = sc.nextInt();
            if (nbre_saisi == nombre_magique) {
                System.out.println("Bravo vous avez trouve");
                break;
            } else {
                nbre_essai--;
                System.out.println("Dommage vous avez rate, il vous reste " + nbre_essai + " essaies");
            }
        }while (nbre_essai > 0);

        System.out.println("Fin de la Partie");

    }
}
