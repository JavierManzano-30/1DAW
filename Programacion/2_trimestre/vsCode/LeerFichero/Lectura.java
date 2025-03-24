import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura {

     public static void main(String[] args) {
        File file = new File("C:\\Users\\javie\\Documents\\DAW1\\1DAW\\Programacion\\2_trimestre\\vsCode\\LeerFichero\\Leeme.txt");
        System.out.println(file.getPath());
        System.out.println();

        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
     }
}