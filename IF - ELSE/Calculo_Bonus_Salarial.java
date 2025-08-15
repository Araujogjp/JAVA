import java.util.Scanner;
public class Luva3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário mensal: ");
        double salario = scanner.nextDouble();
        if(salario <= 1000){
            double acrescimoDez = salario * 0.10;
            double novoSalarioDez = salario + acrescimoDez;
            System.out.println("O Salário terá um acréscimo de " + acrescimoDez);
            System.out.printf("O Novo Salário será de: " + novoSalarioDez);
        }
        else {
            double acrescimoC = salario * 0.05;
            double novoSalarioC = salario + acrescimoC;
            System.out.println("O Salário terá um acréscimo de " + acrescimoC);
            System.out.printf("O novo Salário será de: " + novoSalarioC);
        }
    }
}
