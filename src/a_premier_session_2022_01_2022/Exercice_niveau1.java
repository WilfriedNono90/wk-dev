package a_premier_session_2022_01_2022;

import java.util.Scanner;

public class Exercice_niveau1 {

    public static void main(String[] args) {
        // somme des 100 premier chiffres
        int entier = 0 ;
        for (int i = 1; i <= 100 ; i++) {
            entier = entier + i;
        }
        System.out.println(entier);

        //somme des 5 premiers chiffres pair
        int compteur = 0;
        int numeroActuel = 0;
        int somme = 0;

        while (compteur < 5) {
            if (numeroActuel % 2 == 0){
                System.out.println("ce numero est pair "+numeroActuel);
                // ce nombre est pair
                somme  = somme + numeroActuel;
                //je compte que je fais une addition
                compteur++;
            }
            //pair ou impair on veut tester le chiffre suivant
            numeroActuel++;

        }
        System.out.println(somme);

        //Determinier si un nombre est premier ou pas


        boolean choix;
        boolean affichage = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez un nombre ");
            int nombre = sc.nextInt(); //nextDouble, nextFloat, nextLong, .....String : nextLine()

            for (int i = 2; i <= nombre - 1; i++) {
                if (nombre % i == 0) {
                    System.out.println("Ce nombre n'est premier");
                    affichage = true;
                    break;
                }
                System.out.println("index de i : " + i);
            }

            //hors de la boucle
            if (!affichage) { //affichage == false
                System.out.println(nombre + " est premier");
            }
            System.out.println("voulez vous continuer true or false");
            Scanner scChoix = new Scanner(System.in);
            choix = scChoix.nextBoolean();
        }while(choix); // choix == true




    }
}
