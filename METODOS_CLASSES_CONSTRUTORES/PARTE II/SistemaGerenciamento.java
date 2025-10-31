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

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}


import java.util.ArrayList;
import java.util.Scanner;
public class GerenciarFornecedores {
    private ArrayList<Fornecedor> listFornecedores = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    public void Cadastrar(){
      while(true){
        System.out.println("Cadastro de Fornecedores");
     
        System.out.println("CÃ³digo: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        
        if(codigo < 0){
          System.out.println("CÃ³digo invÃ¡lido");
          continue;
        }
        
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Endereco(Rua): ");
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
    
    public void Editar(){
       System.out.println("Editar Fornecedor");
       System.out.println("Digite o CÃ³digo do Fornecedor: ");
       int codigoFornecedorEditar = sc.nextInt();
       sc.nextLine();
       
       Fornecedor fornEditar = null;
       for(Fornecedor f: listFornecedores){
           if(f.getCodigo() == codigoFornecedorEditar){
               fornEditar = f;
               break;
           }
       }
       
       if(fornEditar == null){
          System.out.println("Erro: fornecedor nÃ£o encontrado no Banco de Dados");
          return;
       }
       
       System.out.println("Editar Fornecedor: "+fornEditar.getNome());
       System.out.println("Deixe em branco e aperte enter se nÃ£o deseja editar o dado em questÃ£o");
       
       System.out.println("Novo Nome: ");
       String nome = sc.nextLine();
       if(!nome.isEmpty()){
           fornEditar.setNome(nome);
       }
       
       System.out.println("Novo Endereco(Rua): ");
       String endereco = sc.nextLine();
       if(!endereco.isEmpty()){
           fornEditar.setEndereco(endereco);
       }
       
       System.out.println("Novo Bairro: ");
       String bairro = sc.nextLine();
       if(!bairro.isEmpty()){
           fornEditar.setBairro(bairro);
       }
       
       System.out.println("Nova Cidade: ");
       String cidade = sc.nextLine();
       if(!cidade.isEmpty()){
           fornEditar.setCidade(cidade);
       }
       
       System.out.println("Novo Uf: ");
       String uf = sc.nextLine();
       if(!uf.isEmpty()){
           fornEditar.setUf(uf);
       }
       
       System.out.println("Novo Cep: ");
       String cep = sc.nextLine();
       if(!cep.isEmpty()){
           fornEditar.setCep(cep);
       }
       
       System.out.println("Novo Telefone: ");
       String telefone = sc.nextLine();
       if(!telefone.isEmpty()){
           fornEditar.setTelefone(telefone);
       }
    }
    public void consultar(){
               
       System.out.println("Consultar Fornecedor");
       System.out.println("Digite o CÃ³digo do Fornecedor: ");
       int codigoFornecedorConsultar = sc.nextInt();
       sc.nextLine();
   
       Fornecedor fornConsultar = null;
       for(Fornecedor f: listFornecedores){
            if(f.getCodigo() == codigoFornecedorConsultar){
                fornConsultar = f;
                break;
            }
        }
        if(fornConsultar != null){
            System.out.println("CÃ³digo: "+fornConsultar.getCodigo()+ 
                           "Nome: "+fornConsultar.getNome()+                
                           "Endereco: "+fornConsultar.getEndereco()+                       
                           "Bairro: "+fornConsultar.getBairro()+
                           "Cidade: "+fornConsultar.getCidade()+  
                           "Uf: "+fornConsultar.getUf()+
                           "Cep: "+fornConsultar.getCep()+    
                           "Telefone: "+fornConsultar.getTelefone()     
                                                       );
        }
        else{
           System.out.println("Fornecedor nÃ£o encontrado!");
        }
    }
    
    public void remover(){
        System.out.println("Remover Fornecedor");
        System.out.println("Digite o cÃ³digo do Fornecedor: ");
        int codigoFornecedorRemover = sc.nextInt();
        sc.nextLine();
        
        Fornecedor fornRemover = null;
        for(Fornecedor f: listFornecedores){
            if(f.getCodigo() == codigoFornecedorRemover){
                fornRemover = f;
                break;
            }
        }
        
        if(fornRemover != null){
           System.out.println("Nome: "+fornRemover.getNome());
           System.out.println("CÃ³digo: "+fornRemover.getCodigo());
           System.out.println("Cidade: "+fornRemover.getCidade());
           System.out.println("Deseja remover s ou n?");
           String escolha = sc.nextLine();
           if(escolha.equalsIgnoreCase("s")){
               listFornecedores.remove(fornRemover);
               System.out.println("Fornecedor removido com sucesso!");
           }
           else{
              System.out.println("OperaÃ§Ã£o cancelada");
           }
        }
    }
    public void listar(){
        
        System.out.println("Lista de Todos os Fornecedores");
        if(listFornecedores.isEmpty()){
           System.out.println("Nenhum fornecedor cadastrado no momento.");
           return;
        }
        for(Fornecedor f: listFornecedores){
            System.out.println(
                "CÃ³digo: " + f.getCodigo() + 
                " | Nome: " + f.getNome() + 
                " | Cidade: " + f.getCidade() +
                " | Telefone: " + f.getTelefone()
            );
        }
    }
}

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String cpf;
    private String rg;
    
    public Cliente(int codigo, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String cpf, String rg){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setUf(String uf) {
        this.uf = uf;
    } 
}



