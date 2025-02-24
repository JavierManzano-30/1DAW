public class EnQuePlanta{

    public static int findTheFloor(String input){
        int numeroPlanta = 0;

        for (int i = 0; i < input.length(); i++) {
            char direccion = input.charAt(i);

            if(direccion == '('){
                numeroPlanta++;
            }else{
                numeroPlanta--;
            }
        }

        return numeroPlanta;
    }
    public static void main(String[] args) {
        
        String input = args.length > 0 ? args[0] : "((((()(()(((((((()))(((()((((()())(())()(((()((((((()((()(()(((()(()((())))()((()()())))))))))()((((((())((()))(((((()(((((((((()()))((()(())()((())((()(()))((()))()))()(((((()(((()()))()())((()((((())()())()((((())()(()(()(((()(())(()(())(((((((())()()(((())(()(()(()(())))(()((((())((()))(((()(()()(((((()()(()(((()(((((())()))()((()(()))()((()((((())((((())(()(((())()()(()()()()()(())((((())((())(()()))()((((())))((((()())()((((())((()())((())(())(((((()((((()(((()((((())(()(((()()))()))(((((((";

        int floor = findTheFloor(input);

        System.out.println(floor);
    }
}