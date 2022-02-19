package wk_dev_workshop;

import java.util.*;


public class AffichageMenu {
    public static void main(String[] args) {
        //WD-24 le code doit pouvoir redemmander aux users d'entrer leur logingdaten
        //si la verfication des donnees n'aboutit pas
        Scanner s = new Scanner(System.in);

        System.out.println("Entrez votre nom:");
        String nom = s.nextLine();
        System.out.println("Entrez votre prenom:");
        String prenom = s.nextLine();
        System.out.println("Entrez votre mot de passe:");
        String mdp = s.nextLine();

        //WD-24 : appel de methode pour verifier les donnees : ca ne te concerne pas Laura
        UserLogin user = new UserLogin(nom,prenom,mdp);

        //WD-24 faire une verifiaction avant d'afficher successfull : if : else
        /*
        if(true) {
            code actuel
        } else {
        code qui gere quand les donnees sont falsch
        }
         */
            System.out.println("Authentication successful");

        //WD-24 : a cote des menus y mettre un choix : 1-Mon Compte, 2-Mes messages
            System.out.println("Mon compte");
            System.out.println("Mes messages");
            System.out.println("Mes commandes effectuees");
            System.out.println("Mon panier");
            System.out.println("Ma liste de souhaits");
            System.out.println("Service retour");

        //WD-24 : demander a l'utilisateur de faire son choix et s'Assure que le choix est un chiffre

        //WD-24 : recuperer le choix de l'utilisateur dans une variable




    }
}

