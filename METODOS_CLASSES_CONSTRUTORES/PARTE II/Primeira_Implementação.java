import java.util.ArrayList;
public class Fornecedor {
    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    
    public Fornecedor(int codigo, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
}

import java.util.ArrayList;
import java.util.Scanner;
public class GerenciarFornecedores {
    private ArrayList<Fornecedor> listFornecedores = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    public void CadastrarFornecedor(){
      while(true){
          
        System.out.println("Código: ");
        int codigo = sc.nextInt();
        if(codigo < 0){
          System.out.println("Código inválido");
          continue;
        }
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Endereco: ");
        String endereco = sc.nextLine();

        System.out.println("Bairro: ");
        String bairro = sc.nextLine();

        System.out.println("Cidade: ");
        String cidade = sc.nextLine();

        System.out.println("Uf: ");
        String uf = sc.nextLine();
   
        System.out.println("Cep: ");
        String cep = sc.nextLine();

        System.out.println("Telefone: ");
        String telefone = sc.nextLine();
        
        Fornecedor f = new Fornecedor(codigo, nome,endereco,bairro,  cidade, uf, cep,telefone);
        listFornecedores.add(f);
                
        System.out.println("Fornecedor Cadastrado com sucesso!\n");
        
        System.out.println("Deseja cadastrar outro fornecedor? s/n: ");
        String resposta = sc.nextLine();
        if (!resposta.equalsIgnoreCase("s")){
            break;
        }
      }
    }
}
