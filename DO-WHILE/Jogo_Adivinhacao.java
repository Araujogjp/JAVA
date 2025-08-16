import java.util.Scanner;
import java.util.Random;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aleatorio = random.nextInt(10) + 1;
        int numero;

        System.out.println("Tente adivinhar o número de 1 a 10!");

        do {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();

            if (numero == aleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                System.out.println("O número sorteado era: " + aleatorio);
            } else if (numero > aleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("O número é maior.");
            }
        } while (numero != aleatorio);
        scanner.close();

    }
}
