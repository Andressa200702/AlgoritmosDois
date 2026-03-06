//Criar array e calcular soma
package exercicios.arrays;
import java.util.Arrays;
public class Ex1 {
    public static void main(String[] args) {
        int [] num = {2, 6, 3};
        int soma = 0;

        for (int j : num) {
            soma += j;
        }
        System.out.println("A soma desse Array é: " + soma);
    }
}

