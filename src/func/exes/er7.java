//Fazer uma função recursiva para fazer a contagem da quantidade de digitos de um número
package func.exes;

public class er7 {
    public static void main(String[] args) {
    int numero = 102028;
    System.out.println("A quatidade de dígitos é: " + contador(numero));
    }

    public static int contador(int n) {
        n = Math.abs(n); // para números negativos

        if (n < 10){
            return 1;
        }
        return 1 + contador(n / 10);
    }
}
