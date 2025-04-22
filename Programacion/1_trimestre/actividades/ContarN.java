public class ContarN
{
  public static void main(String[] args)
  {
    if(args.length < 1)
    {
      System.out.println("Inserte algún argumento.");
      return;
    }
    int limite = Integer.parseInt(args[0]);

    for(int cont = 0; cont < limite; cont++)
    {
      System.out.println(cont);
    }
  }
}