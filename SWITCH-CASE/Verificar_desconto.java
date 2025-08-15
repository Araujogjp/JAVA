import java.util.Scanner;
public class Luva6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um número de (1 a 3): ");
       int desconto = scanner.nextInt();
       if (desconto > 3 || desconto < 1){
           System.out.print("Erro, o número deve estar entre 1 e 3");
       }
       else{
           switch(desconto){
               case 1:
                  System.out.print("Parabéns, você ganhou 5% de desconto");
                  break;
               case 2:
                  System.out.print("Parabéns, você ganhou 10% de desconto");
                  break;
               case 3:
                  System.out.print("Parabéns, você ganhou 15% de desconto");
                  break;
           }  
       }
    }
}
