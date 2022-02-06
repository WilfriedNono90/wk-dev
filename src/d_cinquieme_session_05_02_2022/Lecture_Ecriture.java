package d_cinquieme_session_05_02_2022;

import java.io.*;

public class Lecture_Ecriture {
    public static void main(String[] args) throws IOException {
        File datenBankLogin = new File("datenBankLogin.txt");

        if (!datenBankLogin.exists()) {
            try {
                datenBankLogin.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("datenBankLogin.txt"));
        bw.write("jacques");
        bw.newLine();
        bw.write("blondelle");
        bw.newLine();
        bw.write("nelly");
        bw.newLine();
        bw.write("soreille");
        bw.newLine();

        bw.close();


        BufferedReader br = new BufferedReader(new FileReader("datenBankLogin.txt"));
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();


        File datenBank = new File("datenbank.csv");

        if (!datenBankLogin.exists()) {
            try {
                datenBankLogin.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedReader br1 = new BufferedReader(new FileReader("datenbank.csv"));
        String line1 = "";
        while ((line1 = br1.readLine()) != null) {
            System.out.println(line1);
        }
        br.close();


    }
}
