import java.util.Scanner;
public class Luva4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite um número de (1 a 7): ");
      int dia = scanner.nextInt();
      if (dia > 7 || dia < 1){
          System.out.print("Erro, Deve ser de 1 a 7");
      }
      else{
        switch(dia){
            case 1: 
                System.out.print("Hoje é Segunda");
                break;
            case 2:
                System.out.print("Hoje é Terça");
                break;
            case 3:
                System.out.print("Hoje é Quarta");
                break;
            case 4:
                System.out.print("Hoje é Quinta");
                break;
            case 5:
                System.out.print("Hoje é Sexta");
                break;
            case 6:
                System.out.print("Hoje é Sabádo");
                break;
            case 7:
                System.out.print("Hoje é Domingo");
                break;
        }  
      }         
   }
}
