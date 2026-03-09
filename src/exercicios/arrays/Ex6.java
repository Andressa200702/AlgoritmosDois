//Converter Array para ArrayList
package exercicios.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Uva");

        String[] array = lista.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}