class Produto{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal() {
        return preco * quantidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3000.0, 5));
        produtos.add(new Produto("Xbox", 2500.0, 3));
        produtos.add(new Produto("Ps5", 2400.0, 2));

        double valorEstoque = 0;

        for (Produto p : produtos) {
            valorEstoque += p.valorTotal();
            System.out.println(p.getNome() + " | Preço: " + p.getPreco() +
                               " | Quantidade: " + p.getQuantidade() +
                               " | Total: " + p.valorTotal());
        }

        System.out.println("\n💰 Valor Total do Estoque: " + valorEstoque);
    }
}

        
