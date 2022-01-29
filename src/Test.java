import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Test {

    public void test() {

    }
    public static void main(String[] args) throws IOException {
        String myPath = "C:\\Users\\49152\\Documents\\WK_Dev\\src\\b_deuxieme_session_23_01_2022\\dictionaire.txt";
        File file = new File(myPath);



        // Files.lines(Paths.get(myPath)).forEach(p-> System.out.println(p));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myPath,true));
        bufferedWriter.write("Ajout");
        bufferedWriter.newLine();
        bufferedWriter.close();




        System.out.println(new File(".").getAbsoluteFile());

        BufferedReader bufferedReader = new BufferedReader(new FileReader(myPath));
        String line;
        while ( (line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();

        System.out.println();
        //Paths.get("dictionaire.txt");
        //FileReader file = new FileReader("dictionaire.txt");
        System.out.println();

    }
}
