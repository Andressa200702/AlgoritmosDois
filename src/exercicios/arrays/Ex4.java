//Aplicar binarySearch()
package exercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random band= new Random();
        int [] vetor = new int[10];

        for (int i=0; i <vetor.length; i++){
            vetor[i]= band.nextInt(10);
        }
        System.out.println("=== Vetor original: ===\n" + Arrays.toString(vetor));

        Arrays.sort(vetor);
        System.out.println("\n === Vetor ordenado: ===\n" + Arrays.toString(vetor));

        int indice = Arrays.binarySearch(vetor, 7);
        System.out.println("\n === Binary encontrou: ===\n" + indice);

        for (int i=0; i < vetor.length; i++){
            if (vetor[i] == 7){
                System.out.println("\n=== 7 encontrado na posição: ===\n" + i);
            }
        }
    }
}
