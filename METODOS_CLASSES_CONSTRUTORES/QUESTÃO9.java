import java.util.ArrayList;
import java.util.Iterator; // Importaremos para a remoção segura

// --- CLASSE CONTATO ---
// Representa o molde para um único contato.
class Contato {
    private String nome;
    private String telefone;

    // Construtor para criar um novo contato
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos "getters" para acessar os dados de fora da classe
    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    // Sobrescrevendo o método toString para uma exibição amigável
    @Override
    public String toString() {
        return "Contato [Nome: " + nome + ", Telefone: " + telefone + "]";
    }
}


// --- CLASSE AGENDA ---
// Gerencia uma lista de contatos.
class Agenda {
    private ArrayList<Contato> contatos;

    // Construtor para criar uma agenda com uma lista vazia
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    // Adiciona um novo contato, verificando se já não existe um com o mesmo nome
    public void adicionarContato(Contato novoContato) {
        // Primeiro, buscamos para ver se o contato já existe
        if (buscarContato(novoContato.getNome()) != null) {
            System.out.println("Erro: Já existe um contato com o nome '" + novoContato.getNome() + "'.");
        } else {
            this.contatos.add(novoContato);
            System.out.println("Contato '" + novoContato.getNome() + "' adicionado com sucesso.");
        }
    }

    // Busca um contato pelo nome (ignorando maiúsculas/minúsculas)
    public Contato buscarContato(String nomeBusca) {
        for (Contato contato : this.contatos) {
            if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                return contato; // Retorna o objeto Contato encontrado
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Remove um contato pelo nome
    public void removerContato(String nomeParaRemover) {
        Contato contatoParaRemover = buscarContato(nomeParaRemover);
        
        if (contatoParaRemover != null) {
            this.contatos.remove(contatoParaRemover);
            System.out.println("Contato '" + nomeParaRemover + "' removido com sucesso.");
        } else {
            System.out.println("Erro: Contato com o nome '" + nomeParaRemover + "' não encontrado.");
        }
    }

    // Exibe todos os contatos da agenda
    public void listarContatos() {
        System.out.println("\n--- Lista de Contatos na Agenda ---");
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (Contato contato : this.contatos) {
                System.out.println(contato); // Usa o método toString() do Contato
            }
        }
        System.out.println("-----------------------------------");
    }
}


// --- CLASSE PRINCIPAL PARA TESTE ---
public class TesteAgenda {
    public static void main(String[] args) {
        // 1. Criar uma nova agenda
        Agenda minhaAgenda = new Agenda();

        // 2. Adicionar contatos
        System.out.println("--- Adicionando contatos ---");
        minhaAgenda.adicionarContato(new Contato("Ana", "99999-1111"));
        minhaAgenda.adicionarContato(new Contato("João", "98888-2222"));
        minhaAgenda.adicionarContato(new Contato("Carlos", "97777-3333"));
        minhaAgenda.adicionarContato(new Contato("ana", "11111-9999")); // Tentativa de adicionar duplicado

        // 3. Listar todos os contatos
        minhaAgenda.listarContatos();

        // 4. Buscar um contato específico
        System.out.println("\n--- Buscando contatos ---");
        Contato contatoBuscado = minhaAgenda.buscarContato("João");
        if (contatoBuscado != null) {
            System.out.println("Contato encontrado: " + contatoBuscado);
        } else {
            System.out.println("Contato 'João' não encontrado.");
        }

        Contato contatoInexistente = minhaAgenda.buscarContato("Maria");
        if (contatoInexistente == null) {
            System.out.println("Contato 'Maria' não foi encontrado, como esperado.");
        }

        // 5. Remover um contato
        System.out.println("\n--- Removendo contatos ---");
        minhaAgenda.removerContato("Carlos"); // Deve funcionar
        minhaAgenda.removerContato("Pedro"); // Contato inexistente

        // 6. Listar contatos novamente para ver o resultado
        minhaAgenda.listarContatos();
    }
}
