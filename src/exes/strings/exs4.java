package exes.strings;
public class exs4 {
    public static void main(String[] args) {

        String texto = "java";
        int chave = 4;

        for(int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            char criptografado = (char)(letra + chave);

            System.out.print(criptografado);
        }
    }
}
