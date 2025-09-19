public class ContaBancaria {
    private String nome;
    private double saldo;
    private int numConta;
    private int agencia;

    public ContaBancaria(String nome, int numConta, int agencia) {
        this.nome = nome;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getAgencia() {
        return agencia;
    }
   
   public void depositar(double valor){
       if(valor > 0){
          System.out.println("DEPÓSITO REALIZADO!");
          this.saldo += valor;
       }
       else{
          System.out.println("ESTE VALOR NÃO PODE SER DEPOSITADO");
       }
   } 
   
   public void sacar(double valor){
       if(valor > this.saldo || valor <= 0){
          System.out.println("ERRO! NÃO FOI POSSÍVEL REALIZAR O SAQUE!");
       }
       else{
           this.saldo += valor;
           System.out.println("O SAQUE FOI REALIZADO!");
       }
   }
   
   public void transferir(ContaBancaria destino, double valor){
       if(valor < this.saldo && valor <= 0){
          System.out.println("ERRO! A TRANSFERÊNCIA NÃO PODE SER REALIZADA!");
       }
       else{
          this.saldo -= valor;
          destino.saldo += valor;
          System.out.println("TRANSFERÊNCIA DE: " + valor + "REALIZADA COM SUCESSO!" + "DA CONTA DE NÚMERO: " + this.numConta + ", DO TITULAR: " + this.nome + ", PARA A CONTA DE NÚMERO: " + destino.numConta + ", DO TITULAR: " + destino.nome);
       }
   }
 
}



import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();  // Lista para armazenar as contas
        ContaBancaria contaSelecionada = null;
        
        while(true){
            System.out.println("[QUALQUER OUTRO NÚMERO] PARA SAIR DO APLICATIVO!");
            System.out.println("[1] PARA SE CADASTRAR!");
            System.out.println("[2] PARA SELECIONAR UMA CONTA!");
            System.out.println("[3] PARA DEPOSITAR!");
            System.out.println("[4] PARA SACAR!");
            System.out.println("[5] PARA TRANSFERIR!");
            System.out.println("[6] PARA EXIBIR INFORMAÇÕES!");
            System.out.println("[7] PARA EXIBIR TODAS AS CONTAS!");
            System.out.println("SUA OPÇÃO: ");
            int opcao = scanner.nextInt();
            if(opcao == 1){
                System.out.println("Digite o nome do Titular: ");
                String nome = scanner.next();
                
                System.out.println("Digite o número da conta: ");
                int numConta = scanner.nextInt();
                
                System.out.println("Digite o número da agência: ");
                int agencia = scanner.nextInt();
                
                ContaBancaria newConta = new ContaBancaria(nome, numConta, agencia);
                contas.add(newConta);
                System.out.println("Conta Cadastrada com sucesso!");
            }
            else if(opcao == 2){
                System.out.println("Selecione a conta digitando o número: ");
                int numContaSelecionada = scanner.nextInt();
                contaSelecionada = null;
                
                for(ContaBancaria conta : contas){
                    if(conta.getNumConta() == numContaSelecionada)
                       contaSelecionada = conta;
                       System.out.println("Conta Selecionada com sucesso!");
                       break;
                }
            }
            else if(opcao == 3){
                if(contaSelecionada != null){
                    System.out.println("Digite o valor para depósito: ");
                    double valor = scanner.nextDouble();
                    contaSelecionada.depositar(valor);
                }
                else{
                    System.out.println("Nenhuma conta selecionada!");
                }
            }
            else if(opcao == 4){
                
            }
        }
    }
}
