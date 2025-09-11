class ContaBancaria {
    private String titular;
    private double saldo;
    private int numero;

    // Construtor
    public ContaBancaria(String titular, double saldo, int numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na conta do titular: " + titular + " com sucesso!");
        } else {
            System.out.println("Infelizmente não foi possível realizar o depósito na conta do titular: " + titular);
        }
    }

    // Método sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Infelizmente não foi possível realizar o saque.");
        }
    }

    // Método exibir saldo
    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo + " | Número da conta: " + numero);
    }

    // Método transferir
    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;      // tira da conta que envia
            destino.saldo += valor;   // coloca na conta que recebe
            System.out.println("Transferência de R$ " + valor + " da conta de " + this.titular + " para " + destino.titular);
        } else {
            System.out.println("Infelizmente não foi possível efetuar a transferência.");
        }
    }
}


public class Main2 {
    public static void main(String[] args) {
       ContaBancaria conta1 = new ContaBancaria("João", 10000.0, 100);
       ContaBancaria conta2 = new ContaBancaria("Júlia", 5000.0, 101);
       
       conta1.exibirSaldo();
       conta2.exibirSaldo();
       
       conta1.depositar(1000);
       conta2.sacar(2000);
       
       conta1.transferir(conta2, 500);
       
       conta1.exibirSaldo();
       conta2.exibirSaldo();
    }
}
