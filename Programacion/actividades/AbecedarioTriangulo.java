public class AbecedarioTriangulo
{
  public static void main(String[] args)
  {
    for(int i = 0; i < 26; i++){
        for(char c = (char)('Z'-i); c >= 'A'; c--){
            System.out.print(c);
        }
        System.out.println();
    }
  }
}