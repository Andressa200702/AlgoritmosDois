package func.exes;

public class SomaV {
    public static int soma(int[] vetor, int tamanho) {

        if (tamanho == 0) {
            return 0;
        }

        return vetor[tamanho - 1] + soma(vetor, tamanho - 1);
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int resultado = soma(numeros, numeros.length);

        System.out.println("Soma dos elementos: " + resultado);
    }
}

