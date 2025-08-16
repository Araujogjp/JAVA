import java.util.Scanner;
import java.util.Random;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aleatorio = random.nextInt(10) + 1;

        while (true) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero == aleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                System.out.println("O número sorteado era: " + aleatorio);
                break;
            } else if (numero > aleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("O número é maior.");
            }
        }
    }
}
