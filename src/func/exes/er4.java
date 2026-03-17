//Fazer uma função recursiva para calcular o fatorial de um número
package func.exes;

public class er4 {
    public static void main(String[] args) {
        int n = (Calcular(10));
        System.out.println("O cálculo é: "+n);
    }

    public static int Calcular(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * Calcular(n - 1);
    }
}
