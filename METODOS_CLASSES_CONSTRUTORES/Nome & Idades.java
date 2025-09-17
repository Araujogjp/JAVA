import java.util.Scanner;
public class Informacoes {
    public static void perguntarNomeEIdade(int[] idade, String[] nome){
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Informe seu nome: ");
            nome[i] = scanner.nextLine();
            
            System.out.println("Informe sua idade: ");
            idade[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }
    public static float calcularMedia(int[] idade){
        int soma = 0;
        
        for(int contador : idade){
            soma += contador;
        }
        return (float) soma / idade.length;
    }
    public static int MaiorIdade(int[] idade){
       int maior = idade[0];
       
       for(int i = 1; i < idade.length; i++){
           if(idade[i] > maior){
               maior = idade[i];
           }
       }
       return maior;
    }
    
    public static int MenorIdade(int[] idade){
        int menor = idade[0];
        
        for(int i = 1; i < idade.length; i++){
            if(idade[i] < menor){
                menor = idade[i];
            }
        }
        return menor;
    }
    public static int qtdMaioresDeIdade(int[] idade){
        int maioresDeIdade = 0;
        
        for(int i = 0; i < idade.length; i++){
          if(idade[i] >= 18){
              maioresDeIdade ++;
          }    
        }
        return maioresDeIdade;
    }
     
}

 public class Main3 {
       public static void main(String[] args) {
           int[] idades = new int[5];
           int indice = 0;
           String[] nomes = new String[5];

           Informacoes.perguntarNomeEIdade(idades, nomes);
           float mediaIdade = Informacoes.calcularMedia(idades);
           int maior = Informacoes.MaiorIdade(idades);
           int menor = Informacoes.MenorIdade(idades);
           int maioresDeIdade = Informacoes.qtdMaioresDeIdade(idades);

           System.out.println("Lista de Nomes: ");
           for(String nome : nomes){
               System.out.println(nome);
           }
           System.out.println("Lista de Idades: ");
           for(int idade : idades){
               System.out.println(idade);
           }
           for(int i =0; i < idades.length; i++){
               if(idades[i] == maior){
                   indice = i;
                   break;
               }
           }
           System.out.println("Idade média: " + mediaIdade);
           System.out.println("A pessoa com a maior idade é: " 
                   + nomes[indice] + ", com " 
                   + maior + " anos.");
           System.out.println("Menor Idade: " + menor);
           System.out.println("Quantidades de maiores de idadde: " + maioresDeIdade);
       }
   }


