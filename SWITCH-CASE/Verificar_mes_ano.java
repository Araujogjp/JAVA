import java.util.Scanner;
public class Luva5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite um número de (1 a 12): ");
      int mes = scanner.nextInt();
      if (mes > 12 || mes < 1){
          System.out.print("Erro, Deve ser de 1 a 12");
      }
      else{
        switch(mes){
            case 1: 
                System.out.print("Estamos em Janeiro");
                break;
            case 2:
                System.out.print("Estamos em Fevereiro");
                break;
            case 3:
                System.out.print("Estamos em Março");
                break;
            case 4:
                System.out.print("Estamos em Abril");
                break;
            case 5:
                System.out.print("Estamos em Maio");
                break;
            case 6:
                System.out.print("Estamos em Junho");
                break;
            case 7:
                System.out.print("Estamos em Julho");
                break;
            case 8: 
                System.out.print("Estamos em Agosto");
                break;
            case 9:
                System.out.print("Estamos em Setembro");
                break;
            case 10:
                System.out.print("Estamos em Outubro");
                break;
            case 11:
                System.out.print("Estamos em Novembro");
                break;
            case 12:
                System.out.print("Estamos em Dezembro");
                break;
        }  
      }         
    }
}
