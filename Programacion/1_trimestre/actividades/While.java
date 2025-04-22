import java.util.Scanner;
public class While {
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);

    System.out.println("Dime una palabra:");
    String text = console.nextLine();
    while(!text.equals("fin")){
      System.out.println("Has introducido: " +text);

      System.out.println("Dime una palabra:");
      text = console.nextLine();
    }
  }
}