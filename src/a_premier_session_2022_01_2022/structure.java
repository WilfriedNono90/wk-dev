package a_premier_session_2022_01_2022;

public class structure {

    public static void main(String[] args) {
        String chaine = "Hello le monde ";
        int entier = 2 ;
        boolean choix = false;
        boolean choix2 = true;

        //if - else
        if (entier < 1) {
            entier++;
        } else if (choix != false) {
            entier--;
        } else if (!choix2) { // avec ! choix2 == false // choix2 == true
            entier *= 2;
        } else if ( !(entier < 1) ) { // est ce que entier < 1 == false autrement dit est ce que entier >= 1 == true
            entier /= 2;
        }

        System.out.println(entier);

        // Schleife
        // do schleife
        for (int i = 0; i < 10; i++) {
            System.out.println("saliut "+i);
        }
        System.out.println("================================================");
        //while schleife
        entier = 2;
        while( entier > 1) {
            System.out.println(entier);
            entier--;
        }
        System.out.println("=================================================");
        entier = 2;
        do {
            System.out.println(entier);
        } while (entier > 5);









    }
}
