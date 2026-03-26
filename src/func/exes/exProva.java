
package func.exes;
public class exProva {
    public static String inverter(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return inverter(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String texto = "Java";

        String resultado = inverter(texto);

        System.out.println("String invertida: " + resultado);
    }
}


