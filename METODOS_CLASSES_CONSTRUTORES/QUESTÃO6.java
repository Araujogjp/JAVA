public class Retangulo {
    private double largura;
    private double altura;

    // Construtor da classe
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método que calcula a área
    public double calcularArea() {
        return this.largura * this.altura;
    }

    // Método com a fórmula do perímetro corrigida
    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    // Método que exibe todos os cálculos na tela
    public void exibirCalculos() {
        System.out.println("Largura: " + this.largura);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.calcularArea());
        System.out.println("Perímetro: " + this.calcularPerimetro());
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Cria o primeiro objeto Retangulo
        Retangulo ret1 = new Retangulo(9.0, 6.0);
        
        // Cria o segundo objeto Retangulo
        Retangulo ret2 = new Retangulo(8.0, 10.0);

        // Exibe os cálculos para o primeiro retângulo
        ret1.exibirCalculos();
        
        // Adiciona uma linha em branco para melhor separação
        System.out.println(""); 
        
        // Exibe os cálculos para o segundo retângulo
        ret2.exibirCalculos();
    }
}
