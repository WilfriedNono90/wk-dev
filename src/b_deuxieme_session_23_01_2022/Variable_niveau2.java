package b_deuxieme_session_23_01_2022;

import java.util.*;

public class Variable_niveau2 {

    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = {2,16,23};

        System.out.println("taille de l'Array : "+array.length);

        List<String> dictionaire = new ArrayList<>();
        /*
        arrayslist a taille fixe de 3
         */
        List<String> chiffres = Arrays.asList("willy", "wk", "dev");

        dictionaire.add("Wilfried");
        dictionaire.add("wk_dev");
        dictionaire.add("Wilfried");

        System.out.println(dictionaire.get(1));

        System.out.println("taille de la liste : "+dictionaire.size());

        dictionaire.remove(0);

        //Set
        HashSet<String> dictionaireSansDoublon = new HashSet<String>();

        dictionaireSansDoublon.add("Wilfried");
        dictionaireSansDoublon.add("wk_dev");
        dictionaireSansDoublon.add("Wilfried");

        System.out.println(dictionaireSansDoublon.size());

        //Hashmap
        HashMap<String, Integer> hashMap = new HashMap<>();

        //l'ajout
        hashMap.put("Wilfried",12);
        hashMap.put("wk_dev",13);
        hashMap.put("nelly",14);
        hashMap.put("Wilfried",15);
        hashMap.put("nelly",20);

        //taille
        System.out.println("taille du hashmap : "+hashMap.size() );

        //effacer
        hashMap.remove("Wilfried");

        //list des values
        hashMap.values();

        //liste des clefs
        Set<String> keys = hashMap.keySet();

        //Recuperer les valeurs
        System.out.println( hashMap );

     }
}
