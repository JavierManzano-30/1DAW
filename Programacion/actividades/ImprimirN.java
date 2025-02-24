public class ImprimirN
{
  public static void main(String[] args)
  {
    int option = Integer.parseInt(args[0]);
    int size = Integer.parseInt(args[1]);

    if(option == 1)
    {
      for(int i = 1; i <= size; i++)
      {
        System.out.println(i);
      }
    }
    
    if(option == 2)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= size; i++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
    }

    if(option == 3)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= size; i++)
        {
          System.out.print(j);
        }
        System.out.println();
      }
    }

    if(option == 4)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= j; i++)
        {
          System.out.print(j);
        }
        System.out.println();
        
      }
    }

    if(option == 5)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= j; i++)
        {
          System.out.print('*');
        }
        System.out.println();        
      }
    }

    if(option == 6)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= (size + 1) - j; i++)
        {
          System.out.print('*');
        }
        System.out.println();        
      }
    }

    if(option == 6.1)
    {
      for(int j = size; j > 1; j--)
      {
        for(int i = 1; i <= j; i++)
        {
          System.out.print('*');
        }
        System.out.println();        
      }
    }

    if(option == 7)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int i = 1; i <= j - 1; i++)
        {
          System.out.print(' ');
        }
        for(int i = 1; i <= size + 1 - j; i++)
        {
          System.out.print('*');
        }
        System.out.println();               
      }
    }

    if(option == 8)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int azul = 0; azul < size - j; azul++)
        {
          System.out.print(' ');
        }
        for(int verde = 0; verde < j - 1; verde++)
        {
          System.out.print('*');
        }
        for(int rojo = 0; rojo < j; rojo++)
        {
          System.out.print('*');
        }

        System.out.println();               
      }
    }

    if(option == 8.1)
    {
      for(int j = 1; j <= size; j++)
      {
        for(int azul = 0; azul < size - j; azul++)
        {
          System.out.print(' ');
        }
        for(int verde = 0; verde < j * 2 - 1; verde++)
        {
          System.out.print('*');
        }
        System.out.println();               
      }
    }

    if(option == 9)
    {
      for(int altura = 2; altura <= size; altura++){
        for(int j = 1; j <= altura; j++)
        {
          for(int rojo = 0; rojo < size - altura; rojo++)
          {
            System.out.print(' ');
          }
          for(int azul = 0; azul < altura - j; azul++)
          {
            System.out.print(' ');
          }
          for(int verde = 0; verde < j * 2 - 1; verde++)
          {
            System.out.print('*');
          }
          System.out.println();               
        }
      }
    }

    if(option == 9.1)
    {
      for(int altura = 2; altura <= size; altura++){
        for(int j = 1; j <= altura; j++)
        {
          for(int azul = 0; azul < size - j; azul++)
          {
            System.out.print(' ');
          }
          for(int verde = 0; verde < j * 2 - 1; verde++)
          {
            System.out.print('*');
          }
          System.out.println();               
        }
      }
    }    
  }
}