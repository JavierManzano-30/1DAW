public class Switch {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    switch(n){
      case 0: //if(n ==0)
        System.out.println("Cero.");
        break;
      case 1: //else if(n==1)
        System.out.println("Uno.");
        break;
      case 2: //else if(n==2)
        System.out.println("Dos.");
        break;
      default: //else
        System.out.println("Ninguno.");
    }
  }
}