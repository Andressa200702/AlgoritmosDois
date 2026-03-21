//Fazer uma função recursiva para calcular a soma de todos os
// números naturais entre 1 e n (1 + 2 + 3 + 5 + 7 +... + n)
package func.exes;

import java.util.Scanner;

public class er5 {
    public static void main(String[] args) {

        Scanner cc=new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = cc.nextInt();

        int resultado = soma(n);

        System.out.println("A soma é: " + resultado);
    }

    public static int soma(int n){
        if (n == 0){
            return 0;
        }
        return n + soma(n-1);
    }
}
