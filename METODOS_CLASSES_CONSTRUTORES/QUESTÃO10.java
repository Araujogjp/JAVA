// --- CLASSE PERSONAGEM ---
// Define o molde para os lutadores, com seus atributos e ações.

class Personagem {
    private String nome;
    private double vida;
    private double forca;
    
    // Construtor para criar um novo personagem
    public Personagem(String nome, double vida, double forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }
    
    /**
     * Realiza um ataque em outro personagem (o alvo).
     * @param alvo O Personagem que receberá o dano.
     */
    public void atacar(Personagem alvo) {
        // Mensagem para tornar o combate mais visual
        System.out.println(this.nome + " ataca " + alvo.nome + " com " + this.forca + " de força!");
        
        // Aplica o dano à vida do alvo
        alvo.vida -= this.forca;
        
        // Garante que a vida do alvo não fique com um valor negativo
        if (alvo.vida < 0) {
            alvo.vida = 0;
        }
        
        // Mostra o resultado do ataque
        System.out.println("A vida de " + alvo.nome + " agora é: " + String.format("%.1f", alvo.vida));
    }
    
    /**
     * Exibe as informações atuais do personagem.
     */
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + String.format("%.1f", this.vida)); // Formatando para uma casa decimal
        System.out.println("Força: " + this.forca);
    }
    
    // Getter para obter a vida atual do personagem (essencial para o laço 'while')
    public double getVida() {
        return this.vida;
    }
    
    // Getter para obter o nome do personagem (usado para anunciar o vencedor)
    public String getNome() {
        return this.nome;
    }
}


// --- CLASSE PRINCIPAL (MAIN) ---
// Orquestra a criação dos personagens e a lógica da luta.

public class Main3 {
    public static void main(String[] args) {
        // Criando os dois personagens
        Personagem p1 = new Personagem("Goku", 1000.0, 200.0);
        Personagem p2 = new Personagem("Naruto", 1200.0, 150.0);

        System.out.println("--- INÍCIO DO COMBATE ---");
        System.out.println("Informações iniciais:");
        p1.exibirInformacoes();
        System.out.println(""); // Linha em branco para separar
        p2.exibirInformacoes();
        System.out.println("-------------------------");
        
        // O laço de combate continua enquanto os dois personagens tiverem vida > 0
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            System.out.println(""); // Espaço para separar as rodadas

            // Turno do p1 (Goku)
            p1.atacar(p2);
            
            // Verifica se p2 foi derrotado. Se sim, a luta acaba IMEDIATAMENTE.
            if (p2.getVida() <= 0) {
                break; 
            }

            // Turno do p2 (Naruto) - só acontece se ele sobreviveu ao ataque anterior
            p2.atacar(p1);
        }

        System.out.println("\n--- FIM DO COMBATE ---");

        // Lógica para verificar e anunciar o vencedor
        if (p1.getVida() <= 0) {
            System.out.println("O vencedor é " + p2.getNome() + "!");
        } else {
            System.out.println("O vencedor é " + p1.getNome() + "!");
        }

        // Exibe o estado final dos personagens
        System.out.println("\nInformações finais:");
        p1.exibirInformacoes();
        System.out.println("");
        p2.exibirInformacoes();
    }
}
