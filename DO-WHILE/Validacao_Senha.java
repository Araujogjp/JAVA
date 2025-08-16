import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();
        String digitada;

        do {
            System.out.print("Digite sua senha: ");
            digitada = scanner.nextLine();

            if (!senha.equals(digitada)) {
                System.out.println("Senha Errada");
            }
        } while (!senha.equals(digitada));

    }
}
