class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Cidade: "+ cidade +".");
    }
    public void alterarCidade(String novaCidade){
        this.cidade = novaCidade;
        System.out.println("A cidade de "+ nome + ", foi alterada para: " + novaCidade + ".");
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(){
       this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(){
       this.idade = idade;
    }
    public String getCidade(){
        return cidade;
    } 
    public void setCidade(){
       this.cidade = cidade;
    }
}


public class Main {
    public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa("Lucas", 19, "Governador Valadares");
       Pessoa pessoa2 = new Pessoa("Igor", 19, "Vila Velha");
       Pessoa pessoa3 = new Pessoa("Cauan", 26, "São Francisco de Itabapoana");
       
       System.out.println("Informações Inicias: ");
       pessoa1.exibirInformacoes();
       pessoa2.exibirInformacoes();
       pessoa3.exibirInformacoes();
       
       pessoa1.alterarCidade("Belo Horizonte");
       pessoa2.alterarCidade("Jacarepaguá");
       pessoa3.alterarCidade("Guarapari");
       
       System.out.println("Informações Final: ");
       pessoa1.exibirInformacoes();
       pessoa2.exibirInformacoes();
       pessoa3.exibirInformacoes();
    }
}

