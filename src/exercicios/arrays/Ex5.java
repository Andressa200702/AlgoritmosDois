//Remover números pares da ArrayList
package exercicios.arrays;
import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(12);
        numeros.add(3);
        numeros.add(17);
        numeros.add(4);
        numeros.add(11);
        numeros.add(16);

        numeros.removeIf(n -> n % 2 == 0);

        System.out.println(numeros);
    }
}
