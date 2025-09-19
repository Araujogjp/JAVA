public class Calculadora {
    private Calculadora(){}
    
    public static double somar(double a, double b){
        return a + b;
    }
    
    public static double subtrair(double a, double b){
        return a - b;
    }
    
    public static double multiplicar(double a, double b){
        return a * b;
    }
    
    public static double dividir(double a, double b){
        return a / b;
    }
}


public class Main3 {
    public static void main(String[] args) {
       System.out.println("Somar: ");
       System.out.println(Calculadora.somar(10, 10));
       
       System.out.println("");
       System.out.println("Subtrair: ");
       System.out.println(Calculadora.subtrair(10, 11));
       
       System.out.println("");
       System.out.println("Multiplicar: ");
       System.out.println(Calculadora.multiplicar(10, 100));
       
       System.out.println("");
       System.out.println("Dividir: ");
       System.out.println(Calculadora.dividir(10, 5));
    } 
}
