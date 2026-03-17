package exes.strings;

public class exs5 {
    public static void main(String[] args) {

        String frase = "O Senac tem uma estrutura muito boa!".toLowerCase();
        int contador = 0;

        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == 'a') {
                contador++;
            }

        }
        System.out.println("Quantidade de letras 'a': " + contador);
    }
}
