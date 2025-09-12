public class Carro {
    // --- ATRIBUTOS ---
    // Usamos 'private' para proteger os dados (encapsulamento).
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    // --- CONSTRUTOR ---
    // Método especial chamado ao criar um novo objeto Carro (ex: new Carro(...))
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0; // Todo carro começa parado (velocidade 0).
    }

    // --- MÉTODOS (COMPORTAMENTOS) ---

    /**
     * Aumenta a velocidade do carro.
     * @param incremento O valor em km/h a ser adicionado à velocidade atual.
     */
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidade += incremento;
            System.out.println(this.modelo + " acelerou para " + this.velocidade + " km/h.");
        }
    }

    /**
     * Diminui a velocidade do carro, com uma trava para não ficar negativa.
     * @param decremento O valor em km/h a ser subtraído da velocidade atual.
     */
    public void frear(double decremento) {
        if (decremento > 0) {
            this.velocidade -= decremento;
            // Se a velocidade ficar negativa, ajustamos para 0.
            if (this.velocidade < 0) {
                this.velocidade = 0;
            }
            System.out.println(this.modelo + " freou e agora está a " + this.velocidade + " km/h.");
        }
    }
    
    // --- GETTERS ---
    // Métodos para permitir a leitura dos atributos fora da classe.
    public String getModelo() {
        return modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    // Método extra para exibir o status completo do carro.
    public void exibirStatus() {
        System.out.println("-> Status: " + this.marca + " " + this.modelo + " (" + this.ano + ") | Velocidade: " + this.velocidade + " km/h");
    }
}



public class Main2 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", "Gt3 Rs", 2025, 0.0);
        Carro carro2 = new Carro("Lamborguini","Revuelto", 2025, 0.0);
        
        System.out.println("🏁🏁🏁 A CORRIDA VAI COMEÇAR! 🏁🏁🏁");
        carro1.exibirStatus();
        carro2.exibirStatus();
        System.out.println("-------------------------------------------\n");
        
        System.out.println("🚦 LUZ VERDE! Os carros arrancam!");
        carro1.acelerar(90);
        carro2.acelerar(85);
        System.out.println();
        
        System.out.println("Curva");
        carro1.frear(30);
        carro2.frear(25);
        System.out.println();
        
        System.out.println("Reta Final");
        carro1.acelerar(130);
        carro2.acelerar(129);
        
        if(carro1.getVelocidade() > carro2.getVelocidade()){
           System.out.println("O vencedor é o/a: " + carro1.getModelo() + "!");
        }
        else if(carro2.getVelocidade() > carro1.getVelocidade()){
            System.out.println("O vencedor é o/a: " + carro2.getModelo() + "!");
        }
        else{
            System.out.println("Empate técnico");
        }
    }
}
