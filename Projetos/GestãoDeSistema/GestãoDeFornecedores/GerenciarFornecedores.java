import java.util.ArrayList;
import java.util.Scanner;
public class GerenciarFornecedores {
    private ArrayList<Fornecedor> listFornecedores = new ArrayList<>(); // Lista de Fornecedores
    private Scanner sc = new Scanner(System.in);
    
    public Fornecedor buscarCod(int codigo){ // Buscador de Códigos
        for(Fornecedor f: listFornecedores){ // Percorrer a lista de Fornecedores
            if(f.getCodForn() == codigo){ 
                return f;
            }
        }
        return null;
    }
   
    // Cadastro de Fornecedores
    public void cadastrar(){
        while (true){
          System.out.println("Cadastro de Fornecedores");
          
          System.out.println("Digite o Código de Fornecedor: ");
          int codForn = sc.nextInt();
          sc.nextLine();
          
          if(codForn <= 0){ // Tratamento de Erro
            System.out.println("Código inválido");
            continue;
          }  
          
          System.out.println("Nome: "); // Pegar Nome
          String nomeForn = sc.nextLine();
          if(nomeForn.isEmpty()){ // Não deixar o nome ser vazio
              System.out.println("Nome é Obrigatório");
              continue;
          }
          else{
            if(nomeForn.length() > 255){ // Limite é de 255 caracteres
               System.out.println("O limite é de 255 caracteres");
               continue;
            }
          }
          
          System.out.println("Rua: "); // Pegar o nome da Rua
          String ruaForn = sc.nextLine();
          if(ruaForn.isEmpty()){ // Não deixar o nome ser vazio
            System.out.println("Nome da Rua é obrigatório");
            continue;
          }
          else{
              if(ruaForn.length() > 255){ // Limite é de 255 caracteres
                System.out.println("O limite é de 255 caracteres");
                continue;
              }
          }
          
          System.out.println("Bairro: "); // Pegar o nome do Bairro
          String bairroForn = sc.nextLine();
          if(bairroForn.isEmpty()){ // Nome do Bairro não pode ser vazio
            System.out.println("Nome do Bairro é obrigatório");
            continue;
          }
          else{
              if(bairroForn.length() > 60){ // Limite de caracteres é 60
                System.out.println("O limite é de 60 caracteres");
              }
          }
          
          System.out.println("Cidade: "); // Pegar o nome da cidade
          String cidadeForn = sc.nextLine();
          if(cidadeForn.isEmpty()){ // Nome da cidade não pode ser vazio
            System.out.println("Nome da cidade é obrigatório");
            continue;
          }
          else{
              if(cidadeForn.length() > 60){ // Limite de caracteres é 60
                System.out.println("O limite é de 60 caracteres");
              }
          }
          
          System.out.println("Uf: "); // Pegar o Uf
          String ufForn = sc.nextLine();
          if(ufForn.isEmpty()){ // Uf não pode estar vazio
            System.out.println("Uf é obrigatório");
            continue;
          }
          else{
            if(ufForn.length() > 2){ // Limite de caraceteres é 2
               System.out.println("O limite é de 2 caracteres");
               continue;
            }
          }
          
          System.out.println("Cep: "); // Pegar o cep
          String cepForn = sc.nextLine();
          if(cepForn.isEmpty()){ // Cep não pode estar vazio
            System.out.println("Cep é obrigatório");
            continue;
          }
          else{
            if(cepForn.length() > 10){ // Limite de caracteres é 10
               System.out.println("O limite é de 10 caracteres");
               continue;
            }
          }
          
          System.out.println("Telefone: "); // Pegar o Telefone
          String telefoneForn = sc.nextLine(); 
          if(telefoneForn.isEmpty()){ // Telefone não pode estar vazio
            System.out.println("Telefone é obrigatório");
            continue;
          }
          else{
            if(telefoneForn.length() > 20){ // Limite de caracteres é 20
               System.out.println("O limite é de 20 caracteres");
               continue;
            }
          }
          Fornecedor forn = new Fornecedor(codForn, nomeForn, ruaForn, bairroForn, cidadeForn, ufForn, cepForn, telefoneForn); // Chamar o Construtor
          listFornecedores.add(forn); // Adicionando o Fornecedor na Lista
          System.out.println("Fornecedor cadastrado com sucesso");
          break;
        }
    }
}
