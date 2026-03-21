//Busca em um vetor de números inteiros
//Criar um vetor de numeros inteiros
//A função deve ser booleana
//Não pode usar arraylist
package func.exes;
import java.util.Arrays;
public class er3 {
    public static void main(String[] args) {
        int [] vetor = {34, 78, 32, 12, 52};
        System.out.println(Busca(vetor, 12));
        System.out.println(Busca(vetor, 10));
    }

    public static boolean Busca(int [] vetor, int x){
        for (int n : vetor) {
            if (n == x) return true;
        }
        return false;
    }
}
