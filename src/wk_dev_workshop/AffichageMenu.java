package wk_dev_workshop;

import java.util.*;


public class AffichageMenu {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Entrez votre nom:");
        String nom = s.nextLine();
        System.out.println("Entrez votre prenom:");
        String prenom = s.nextLine();
        System.out.println("Entrez votre mot de passe:");
        String mdp = s.nextLine();

        UserLogin user = new UserLogin(nom,prenom,mdp);


            System.out.println("Authentication successful");

            System.out.println("Mon compte");
            System.out.println("Mes messages");
            System.out.println("Mes commandes effectuees");
            System.out.println("Mon panier");
            System.out.println("Ma liste de souhaits");
            System.out.println("Service retour");


    }
}

