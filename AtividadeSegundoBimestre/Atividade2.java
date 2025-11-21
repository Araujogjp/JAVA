// Pagamento
public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processar();
}

// PagamentoCartao
public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento de R$ " + valor +
                " via Cartão. Número: " + numeroCartao);
    }
}

// PagamentoPix
public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento de R$ " + valor +
                " via Pix. Chave: " + chavePix);
    }
}


// Caixa

import java.util.List;

public class Caixa {

    public void processarPagamentos(List<Pagamento> pagamentos) {
        for (Pagamento p : pagamentos) {
            p.processar();  
        }
    }
}

// Main

import java.util.Arrays;
public class AtividadeAvaliativa {

    public static void main(String[] args) {
        Pagamento p1 = new PagamentoCartao(150.0, "1234 5678 9000 1111");
        Pagamento p2 = new PagamentoPix(75.5, "yuriAlberto@golaberto.com");

        Caixa caixa = new Caixa();
        caixa.processarPagamentos(Arrays.asList(p1, p2));
    }
}
