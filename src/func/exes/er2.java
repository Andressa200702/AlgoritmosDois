//recursividade com fatorial e ternário
package func.exes;
public class er2 {
    public static void main(String[] args) {
        int n = CalcularFatorial(4);
        System.out.println(n);
    }

    public static int CalcularFatorial(int n){
        return (n == 1 || n == 0) ? 1 : n * CalcularFatorial(n - 1);
    }
}
