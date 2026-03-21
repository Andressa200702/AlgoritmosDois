//Criar um programa que calcule o determinante de uma matriz 3x3
package exercicios.arrays;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int det =
                matriz[0][0] * matriz[1][1] * matriz[2][2] +
                        matriz[0][1] * matriz[1][2] * matriz[2][0] +
                        matriz[0][2] * matriz[1][0] * matriz[2][1] -
                        matriz[0][2] * matriz[1][1] * matriz[2][0] -
                        matriz[0][1] * matriz[1][0] * matriz[2][2] -
                        matriz[0][0] * matriz[1][2] * matriz[2][1];


        System.out.println("Determinante = " + det);
    }
}
