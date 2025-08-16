public class Ex08 {

    public static void main(String[] args) {
        int soma = 0;

        for (int i = 0; i <= 100; i += 2) {
            soma += i;
        }

        System.out.printf("A soma de todos os números pares de (1 a 100): %d\n", soma);
    }
}
