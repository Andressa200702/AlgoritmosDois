//Crie um login e senha
//1-> Verificação de login e email
//2-> Verificação de senha min. 6 caracteres
package exes.strings;
import java.util.Scanner;
public class exs1 {
    public static void main(String[] args) {
        Scanner vs = new Scanner(System.in);

        String emailCorreto = "anagomes@gmail.com";
        String senhaCorreta = "Eu123!";

        System.out.println("=== Digite o seu email: ===");
        String email = vs.nextLine();

        System.out.println("=== Digite a sua senha: ===");
        String senha = vs.nextLine();

        if (email.equals(emailCorreto) && senha.equals(senhaCorreta) && senha.length() >= 6) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Email ou senha inválidos.");
        }
    }
}


