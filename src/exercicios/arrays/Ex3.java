//Ordenar array com Arrays.sort()
package exercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random rand= new Random();
        int [] num = new int[5];

        for (int i=0; i < num.length; i++){
            num[i]= rand.nextInt(11);
        }
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        System.out.println("Ordem crescente:");
        System.out.println(Arrays.toString(num));
    }
}
