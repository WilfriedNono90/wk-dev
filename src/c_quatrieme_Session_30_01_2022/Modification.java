package c_quatrieme_Session_30_01_2022;

public class Modification {

    private static int number = 0;

    public static void modifyName(Etudiant etudiant) {
        number++;
        etudiant.setNom("name have been modified");
    }

    public static void changeValue(int a) {
        number++;
        a = 12;
    }

    //utilisation de la willcard
    public static int getNumber() {
        return  number % 2 == 0 ? 2 : number % 3 == 0 ? 4 : 5 ;
    }

    public static void setNumber(int number) {
        Modification.number = number;
    }
}
