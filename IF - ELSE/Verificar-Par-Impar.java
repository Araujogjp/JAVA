import java.util.Scanner;
public class UVV_CC3M {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Digite um número inteiro: ");
     int verificacao = scanner.nextInt();
     if (verificacao % 2 == 0){
        System.out.print("É um número par");
    }
     else { 
        System.out.print("É um número ímpar");
    }   
    }
}
