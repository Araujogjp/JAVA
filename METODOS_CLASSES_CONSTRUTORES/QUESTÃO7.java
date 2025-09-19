import java.util.ArrayList;
import java.util.List;

// --- CLASSE LIVRO ---
// Representa o molde para um único livro.
class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor para criar um novo livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // Todo livro começa como disponível
    }

    // Métodos "getters" para acessar os atributos de fora da classe
    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    // Ações que um livro pode sofrer
    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + this.titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso.");
        } else {
            System.out.println("O livro '" + this.titulo + "' já se encontra na biblioteca.");
        }
    }

    // Sobrescrevendo o método toString para uma exibição amigável
    @Override
    public String toString() {
        return "Livro: '" + titulo + "' | Autor: " + autor + " | Status: " + (disponivel ? "Disponível ✅" : "Emprestado ❌");
    }
}


// --- CLASSE BIBLIOTECA ---
// Gerencia uma coleção (acervo) de livros.
class Biblioteca {
    private List<Livro> acervo;

    // Construtor para criar uma biblioteca com uma lista vazia
    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    // Adiciona um novo livro ao acervo da biblioteca
    public void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado ao acervo.");
    }

    // Exibe todos os livros e seus status
    public void exibirLivros() {
        System.out.println("\n--- Acervo da Biblioteca ---");
        if (acervo.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
            return;
        }
        for (Livro livro : this.acervo) {
            System.out.println(livro); // Usa o método toString() do Livro
        }
        System.out.println("--------------------------");
    }
    
    // Método auxiliar para encontrar um livro pelo título
    private Livro buscarLivro(String titulo) {
        for (Livro livro : this.acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // Retorna null se não encontrar o livro
    }

    // Empresta um livro se ele for encontrado e estiver disponível
    public void emprestarLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null) {
            livro.emprestar(); // O próprio livro gerencia sua disponibilidade
        } else {
            System.out.println("Livro com o título '" + titulo + "' não encontrado no acervo.");
        }
    }

    // Devolve um livro se ele for encontrado
    public void devolverLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null) {
            livro.devolver(); // O próprio livro gerencia sua disponibilidade
        } else {
            System.out.println("Livro com o título '" + titulo + "' não pertence a este acervo.");
        }
    }
}


// --- CLASSE PRINCIPAL PARA TESTE ---
public class TesteBiblioteca {
    public static void main(String[] args) {
        // 1. Criar uma nova biblioteca
        Biblioteca minhaBiblioteca = new Biblioteca();

        // 2. Adicionar alguns livros à biblioteca
        System.out.println("--- Adicionando Livros ---");
        minhaBiblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        minhaBiblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        minhaBiblioteca.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes"));

        // 3. Exibir o acervo inicial
        minhaBiblioteca.exibirLivros();

        // 4. Simular o empréstimo de livros
        System.out.println("\n--- Realizando Empréstimos ---");
        minhaBiblioteca.emprestarLivro("1984"); // Deve funcionar
        minhaBiblioteca.emprestarLivro("O Hobbit"); // Livro inexistente
        minhaBiblioteca.emprestarLivro("1984"); // Tentar emprestar de novo

        // 5. Exibir o acervo após os empréstimos
        minhaBiblioteca.exibirLivros();

        // 6. Simular a devolução de um livro
        System.out.println("\n--- Realizando Devoluções ---");
        minhaBiblioteca.devolverLivro("1984"); // Deve funcionar
        minhaBiblioteca.devolverLivro("Dom Quixote"); // Tentar devolver um livro que não foi emprestado

        // 7. Exibir o acervo final
        minhaBiblioteca.exibirLivros();
    }
}
