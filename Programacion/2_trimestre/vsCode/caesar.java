public class caesar {

    public static void main(String[] args) {
        System.out.println(caesarEncode("AAA", 4));

        System.out.println(applyRotor("EFG", "BDFHJLCPRTXVZNYEIWGAKMUSQO"));
        System.out.println(applyRotor("JLC", "AJDKSIRUXBLHWTMCQGZNPYFVOE"));
        System.out.println(applyRotor("BHD", "EKMFLGDQVZNTOWYHXUSPAIBRCJ"));

        System.out.println(applyRotorInv("KQF", "EKMFLGDQVZNTOWYHXUSPAIBRCJ"));
        System.out.println(applyRotorInv("BHD", "AJDKSIRUXBLHWTMCQGZNPYFVOE"));
        System.out.println(applyRotorInv("JLC", "BDFHJLCPRTXVZNYEIWGAKMUSQO"));

        System.out.println(caesarDecode("EFG", 4));
    }

    public static String caesarEncode(String text, int shift){
        String textoEncriptado = "";
        
        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);

            int newLetra = letra + shift + i;
            while(newLetra > 90){
                newLetra -= 1 + 'Z' - 'A';
            }
            textoEncriptado += (char)(newLetra);
        }
        return textoEncriptado;
    }

    public static String caesarDecode(String textoEncriptado, int shift){
        String text = "";
        
        for (int i = 0; i < textoEncriptado.length(); i++) {
            char letra = textoEncriptado.charAt(i);

            int newLetra = (char)(letra - (shift + i));
            while(newLetra < 65){
                newLetra += 1 + 'Z' - 'A';
            }
            text += (char)(newLetra);
        }
        return text;
    }

    public static String applyRotor(String text, String rotor){
        String rotatedText = "";
        for (int i = 0; i < text.length(); i++) {
            int posicionABC = text.charAt(i) - 'A';
            rotatedText += rotor.charAt(posicionABC);
        }
        return rotatedText;
    }

    public static String applyRotorInv(String text, String rotor){
        String rotatedText = "";
        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);
            int posicionABC = -1;
            for (int j = 0; j < rotor.length(); j++) {
                if (letra == rotor.charAt(j)) {
                    posicionABC = j;
                }
            }
            rotatedText += (char)(posicionABC + 'A');
        }
        return rotatedText;
    }
}