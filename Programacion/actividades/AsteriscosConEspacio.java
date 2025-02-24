public class AsteriscosConEspacio{
    public static void main(String[] args){
        final int N = Integer.parseInt(args[0]);

        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                System.out.println(" *****");
            }else{
                System.out.println("*****");
            }
        }
    }
}