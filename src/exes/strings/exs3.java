package exes.strings;

public class exs3 {
    public static void main(String[] args) {

        String palavra = "Senac";
        int contador = 0;

        for(int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if(letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);
    }
}
