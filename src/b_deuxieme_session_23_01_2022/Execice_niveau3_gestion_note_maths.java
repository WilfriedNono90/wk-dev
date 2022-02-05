package b_deuxieme_session_23_01_2022;

import java.util.HashMap;
import java.util.Map;

public class Execice_niveau3_gestion_note_maths {
    public static void main(String[] args) {
        HashMap<String,Double> schule = new HashMap<>();
// noms et le commentaire de willy
        //WD-16 : utiliser a la place une schleife
        schule.put("Wilfried",new Double(17));
        schule.put("Jacque",new Double(14));
        schule.put("Nelly",new Double(15));
        schule.put("Gigi",new Double(16));


        System.out.println(schule.get("Wilfried"));

        double somme = 0;
        for (Map.Entry<String,Double> line:schule.entrySet()) {
            somme += line.getValue();
        }

        System.out.println("moyenne "+somme/schule.size());
    }
}
