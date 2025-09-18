package AulaPraticaClassesAbstratasEoPrincipioAbertoFechado180925.exemploCorreto;

import AulaPraticaClassesAbstratasEoPrincipioAbertoFechado180925.exemploRuim.TipoPagamento;

public class PagamentoPix extends PagamentoAbstrato {
    private String chavePixDestinatario;
    private double valorDoPix;
    private double saldoDaConta;
    private TipoPagamento tipoPagamento = TipoPagamento.PIX;

    public PagamentoPix(String chavePixDestinatario, double valorDoPix) {
        this.chavePixDestinatario = chavePixDestinatario;
        this.valorDoPix = valorDoPix;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    @Override
    public void efetuarPagamento() {
        if (this.chavePixDestinatario != null && !this.chavePixDestinatario.isEmpty()) {
            if (this.valorDoPix > 0 && this.saldoDaConta > 0) {
                System.out.println("Pix efetuado no valor " + this.valorDoPix + " para a chave destino " + this.chavePixDestinatario);
            }
        }
    }
}
