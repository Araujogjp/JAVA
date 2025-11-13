import java.util.ArrayList;
public class Interfaces {

    public static void main(String[] args) {
        ArrayList<ProdutoFisico> listProdutos = new ArrayList<>();
        
        listProdutos.add(new ProdutoFisico("Igor", 10.00, 5));
        listProdutos.add(new ProdutoFisico("Manga", 12.00, 7));
        
        for(ProdutoFisico pf: listProdutos){
            System.out.println("PreÃ§o Antes: "+pf.calcularPrecoTotal());
            pf.aplicarDesconto(2);
            System.out.println("PreÃ§o depois: "+pf.calcularPrecoTotal());
        }
}


public interface Vendaval {
    double calcularPrecoTotal();
    void aplicarDesconto(double percentual);
}


public class ProdutoFisico implements Vendaval{
    private String nome;
    private double preco;
    private int qtd;
    
    public ProdutoFisico(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    @Override
    public double calcularPrecoTotal(){
        return preco * qtd;
    }
    
    @Override
    public void aplicarDesconto(double percentual){
        if(percentual > 0 && percentual < 100){
            preco -= preco * (percentual / 100);
        }
    }
    
}

public class Servico implements Vendaval{
    private String descricao;
    private double valorHora;
    private double horasTrabalhadas;


    public Servico(String descricao, double valorHora,double horasTrabalhadas){
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPrecoTotal(){
        return valorHora * horasTrabalhadas;
    }

    @Override
    public void aplicarDesconto(double percentual){
        if(percentual > 0 && percentual <= 100){
            valorHora -= valorHora * (percentual / 100);
        }
    }
}

  


  
