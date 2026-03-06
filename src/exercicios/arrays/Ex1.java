//Criar array e calcular soma
package exercicios.arrays;
import java.util.Arrays;
public class Ex1 {
    public static void main(String[] args) {
        int [] num = {2, 6, 3};
        int soma = 0;

        for (int i= 0; i < num.length; i++){
            soma += num[i];
        }
        System.out.println("A soma desse Array é: " + soma);
    }
}

