package b_deuxieme_session_23_01_2022;

import java.util.HashMap;
import java.util.Map;

public class Execice_niveau3_gestion_note_maths {
    public static void main(String[] args) {
        HashMap<String,Double> datenBank = new HashMap<>();

        datenBank.put("Wilfried",new Double(17));
        datenBank.put("Jacque",new Double(14));
        datenBank.put("Nelly",new Double(15));
        datenBank.put("Gigi",new Double(16));


        System.out.println(datenBank.get("Wilfried"));

        double somme = 0;
        for (Map.Entry<String,Double> line:datenBank.entrySet()) {
            somme += line.getValue();
        }

        System.out.println("moyenne "+somme/datenBank.size());
    }
}
