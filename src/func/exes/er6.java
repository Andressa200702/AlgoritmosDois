//Fazer uma função recursiva para calcular a Sequência de Fibonacci
//Após o terceiro número em diante é feito a soma de DOIS anteriores
package func.exes;
public class er6 {
    public static void main(String[] args) {
        int n= 20;
        System.out.println("A sequência é:" );

        for (int i = 0; i < n; i++) {
            System.out.println(sequencia(i) + " ");
        }
    }

    public static int sequencia(int n){
        if (n <= 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return sequencia(n - 1) + sequencia(n - 2);
    }
}


