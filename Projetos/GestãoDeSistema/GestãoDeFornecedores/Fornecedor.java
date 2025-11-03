import java.util.ArrayList;
public class Fornecedor {
   // Atributos 
   private int codForn;
   private String nomeForn;
   private String ruaForn;
   private String bairroForn;
   private String cidadeForn;
   private String ufForn;
   private String cepForn;
   private String telefoneForn;
   private ArrayList<Produto> p;
   
   // Construtor
   public Fornecedor(int codForn, String nomeForn, String ruaForn, String bairroForn, String cidadeForn, String ufForn, String cepForn, String TelefoneForn){
        this.codForn = codForn;
        this.nomeForn = nomeForn;
        this.ruaForn = ruaForn;
        this.bairroForn = bairroForn;
        this.cidadeForn = cidadeForn;
        this.ufForn = ufForn;
        this.cepForn = cepForn;
        this.telefoneForn = telefoneForn;
        this.p = new ArrayList<>(); // Lista de Produtos Fornecidos pelo Fornecedor
   }

    // Getters
    public int getCodForn() {
        return codForn;
    }

    public String getNomeForn() {
        return nomeForn;
    }

    public String getRuaForn() {
        return ruaForn;
    }

    public String getBairroForn() {
        return bairroForn;
    }

    public String getCidadeForn() {
        return cidadeForn;
    }

    public String getCepForn() {
        return cepForn;
    }

    public String getUfForn() {
        return ufForn;
    }

    public String getTelefoneForn() {
        return telefoneForn;
    }
     
    public void addProduto(Produto prod){ // Método de Adição de Produtos ligados á um Fornecedor
        this.p.add(prod);
    }

    public ArrayList<Produto> getP() { 
        return p;
    }

    // Setters
    public void setNomeForn(String nomeForn) {
        this.nomeForn = nomeForn;
    }

    public void setRuaForn(String ruaForn) {
        this.ruaForn = ruaForn;
    }

    public void setBairroForn(String bairroForn) {
        this.bairroForn = bairroForn;
    }

    public void setCidadeForn(String cidadeForn) {
        this.cidadeForn = cidadeForn;
    }

    public void setCepForn(String cepForn) {
        this.cepForn = cepForn;
    }

    public void setUfForn(String ufForn) {
        this.ufForn = ufForn;
    }

    public void setTelefoneForn(String telefoneForn) {
        this.telefoneForn = telefoneForn;
    }
}
