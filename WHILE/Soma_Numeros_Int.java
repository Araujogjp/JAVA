import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int soma = 0;

        while (true) {
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();

            if (numero < 1) {
                System.out.print("A soma foi de: " + soma);
                break;
            } else {
                soma += numero;
            }

        }
    }
}
