package AulaPraticaClassesAbstratasEoPrincipioAbertoFechado180925.exemploCorreto;

import AulaPraticaClassesAbstratasEoPrincipioAbertoFechado180925.exemploRuim.TipoPagamento;

public class PagamentoCredito extends PagamentoAbstrato {
    private double limiteCartaoDeCredito;
    private TipoPagamento tipoPagamento = TipoPagamento.CREDITO;
    private double valorComprado;

    public PagamentoCredito(double limiteCartaoDeCredito, double valorComprado) {
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
        this.valorComprado = valorComprado;
    }

    @Override
    public void efetuarPagamento() {
        if (this.limiteCartaoDeCredito > this.valorComprado) {
            System.out.println("Pagamento efetuado no cartão de crédito");
        }
    }
}
