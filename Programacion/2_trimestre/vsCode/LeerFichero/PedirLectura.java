import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PedirLectura {
    
    public static void main(String[] args) throws IOException {
        String word = args[0];
        int times = Integer.parseInt(args[1]);

        try {
            FileWriter escritor = new FileWriter("./repeat.txt");
            for (int i = 0; i < times; i+=1) {
                escritor.write(word + "\n");
                //escritor.flush();
                Thread.sleep(1000);
            }
            escritor.close();
        } catch (IOException | InterruptedException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
