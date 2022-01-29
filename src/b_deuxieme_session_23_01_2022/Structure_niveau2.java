package b_deuxieme_session_23_01_2022;

import java.util.*;
import java.util.stream.Collectors;

public class Structure_niveau2 {
    public static void main(String[] args) {
        //Hashmap
        HashMap<String, Integer> hashMap = new HashMap<>();

        //l'ajout
        hashMap.put("Wilfried",12);
        hashMap.put("wk_dev",13);
        hashMap.put("nelly",14);
        hashMap.put("Wilfried",15);
        hashMap.put("nelly",20);

        List<String> dictionaire = new ArrayList<>();

        dictionaire.add("Wilfried");
        dictionaire.add("wk_dev");
        dictionaire.add("Wilfried");

        //for each
        for (String tampon : dictionaire ) {
            //laisse moi faire un travail
            System.out.println(tampon);
        }

        System.out.println("================ Stream ==============");
        dictionaire.stream().forEach( p -> System.out.println(p));

        System.out.println("======================foreach==============");
        dictionaire.forEach(p -> System.out.println(p));

        //convertir des collections en list avec les stream
        List<Integer> values = hashMap.values().stream().collect(Collectors.toList());

        System.out.println("================ parcour de hashmap ==============");

        //foreach
        for (Map.Entry<String, Integer> key_value : hashMap.entrySet()) {
            //laisse moi faire un traitement
            System.out.println(key_value.getKey()+" -> "+key_value.getValue());
        }

        //foreach niveau2
        hashMap.forEach( (k,v) -> System.out.println(k+" -> "+v) );

        //Stream
        hashMap.keySet().stream().forEach(k -> System.out.println(k+"  ->  "+hashMap.get(k)));

    }
}
