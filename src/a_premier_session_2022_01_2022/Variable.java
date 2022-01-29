package a_premier_session_2022_01_2022;

public class Variable {

    public static void main(String[] args) {

        //conteneur de niveau 1
        // les Types primitif


        int entier ;
        long entier_up;
        float reel ;
        double reel_up ;

        char character;
        String chaine;
        boolean binaire = true ;

        //Affectation

        entier = 2 ;
        entier_up = 35L;
        reel = 2f;
        reel_up = 23.5;
        character = 'c';
        chaine = "Hello le monde";
        String chaine2 = " chez Wk_dev";


        entier_up = entier;

        entier_up = entier_up + entier;

        // operateur : + - / * %  +=, -=, ++ ,--

        //concatenation

        System.out.println(chaine+entier);
        System.out.println(chaine+chaine2);
        System.out.println(entier);
        System.out.println(entier_up);
        System.out.println(entier+entier_up);
        System.out.println(entier+""+entier_up);

        //casting
        //cette operation est impossible : entier = entier_up
        entier = (int) entier_up;

        reel = (float) reel_up;

        //caster ici est inutile
        reel_up = reel ;

        //casting exeption
        chaine = Character.toString(character);

        //arrays
        int[] array1 = new int[5];
        array1[0] = 2;
        array1[4] = 3;


        int[] array2 = {2,7,9};
        //    position  0 1 2
        //    up index  0 1 2

        entier = array2[2];
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);












        System.out.println("Hello World");
    }
}
