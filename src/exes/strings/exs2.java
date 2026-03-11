//Usuário digita o cpf xxx.xxx.xxx-xx
// o programa deve limpar os "." e "-" para guardar apenas os números dentro da String
package exes.strings;
import java.util.Scanner;
   public class exs2 {
        public static void main(String[] args) {
            Scanner cs = new Scanner(System.in);

            System.out.println("Digita o seu CPF: ");
            String cpf = cs.nextLine();

            cpf = cpf.replace("-",".");
            cpf = cpf.replace(".","");

            System.out.println("Seu CPF é: " + cpf);
        }
   }


