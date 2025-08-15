import java.util.Scanner;
public class Luva2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite sua idade: ");
      int idade = scanner.nextInt();
      if (idade >= 18){
          System.out.print("Você é maior de idade");
      }
      else {
          System.out.print("Você é menor de idade");
      }
    }
}
