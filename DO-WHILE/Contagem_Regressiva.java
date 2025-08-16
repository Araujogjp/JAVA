import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int escolha = scanner.nextInt();

        do {
            System.out.println("Contagem regressiva: " + escolha);
            escolha--;
        } while (escolha >= 1);

    }
}
