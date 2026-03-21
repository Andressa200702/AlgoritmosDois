//recusividade com ternário
package func.exes;
public class er1 {
    public static void main(String[] args) {
        int s= soma(5);
        System.out.println(s);
    }
    public static int soma(int n) {
        return (n == 1) ? 1 : n + soma(n - 1);
    }
}

