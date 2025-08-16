import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int multiplicacao;

        for (int i = 1; i <= 10; i++) {
            multiplicacao = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, multiplicacao);
        }

    }
}
