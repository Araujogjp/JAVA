// Classe Cliente
  public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { 
      return nome; 
    }
    public String getTelefone() {
      return telefone; 
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + "', telefone='" + telefone + "'}";
    }
}

// Classe ItemPedido
public class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    public ItemPedido(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal() {
        return quantidade * precoUnitario;
    }

    public String getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }
}

// Classe Pedido
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime data;
    private double valorTotal;
    private String status; 
    
    private Cliente cliente; 
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.data = LocalDateTime.now();
        this.valorTotal = 0.0;
        this.status = "Aguardando";
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
        calcularTotal();
    }

    public void calcularTotal() {
        this.valorTotal = 0.0;
        for (ItemPedido item : itens) {
            this.valorTotal += item.getSubtotal();
        }
    }

    public void alterarStatus(String novoStatus) {
        
        String statusAtual = this.status.toLowerCase();
        String novoStatusLower = novoStatus.toLowerCase();

        
        if (statusAtual.equals("entregue")) {
             throw new IllegalStateException("Não é possível alterar o status após o pedido ter sido entregue.");
        }
        
      
        boolean transicaoValida = false;
        
        if (statusAtual.equals("aguardando") && novoStatusLower.equals("em preparo")) {
            transicaoValida = true;
        } 
        else if (statusAtual.equals("em preparo") && novoStatusLower.equals("saiu para entrega")) {
            transicaoValida = true;
        } 
        else if (statusAtual.equals("saiu para entrega") && novoStatusLower.equals("entregue")) {
            transicaoValida = true;
        } 
        else if (statusAtual.equals(novoStatusLower)) {
            return; 
        }

        if (transicaoValida) {
            this.status = novoStatus;
        } 
        else {
            throw new IllegalStateException(
                "Transição de status inválida: de '" + this.status + "' para '" + novoStatus + "'."
            );
        }
    }

    
    public Cliente getCliente() { return cliente; }
    public double getValorTotal() { return valorTotal; }
    public String getStatus() { return status; }
    public List<ItemPedido> getItens() { return itens; }

    @Override
    public String toString() {
        return String.format("Pedido [Cliente: %s, Total: R$%.2f, Status: %s]",
            cliente.getNome(), valorTotal, status);
    }
}

// Main

public class AtividadeAvaliativa {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Ana Silva", "9999-8888");
        Pedido p1 = new Pedido(c1);

        p1.adicionarItem(new ItemPedido("Hambúrguer Clássico", 2, 25.00));
        p1.adicionarItem(new ItemPedido("Refrigerante Cola", 3, 7.50));

        System.out.println("--- TESTE P1 (CORRETO) ---");
        System.out.println("INICIAL: " + p1);

        try {
            p1.alterarStatus("Em preparo");
            System.out.println("1. OK: " + p1.getStatus());
            
            p1.alterarStatus("Saiu para entrega");
            System.out.println("2. OK: " + p1.getStatus());

            p1.alterarStatus("Entregue");
            System.out.println("3. OK: " + p1.getStatus());

        } 
        catch (IllegalStateException e) {
            System.err.println("ERRO INESPERADO: " + e.getMessage());
        }
        
        System.out.println("\n--------------------------\n");

        
        Pedido p2 = new Pedido(new Cliente("Bruno M.", "1111-2222"));
        System.out.println("--- TESTE P2 (INCORRETO) ---");
        System.out.println("INICIAL: " + p2.getStatus());
        
        try {
           
            System.out.println("Tentando alterar de " + p2.getStatus() + " para Entregue...");
            p2.alterarStatus("Entregue"); 
            System.out.println("Status p2 após tentativa: " + p2.getStatus());
        } 
        catch (IllegalStateException e) {
           
            System.err.println("4. ERRO CAPTURADO (Transição Inválida): " + e.getMessage());
            System.out.println("Status p2 permaneceu: " + p2.getStatus());
        }
    }
}

