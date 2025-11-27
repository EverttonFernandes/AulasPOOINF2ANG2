package AulaPraticaSimuladoProvaPratica271125.simuladoacai;

public class Pedido {
    private TipoPagamento tipoPagamento;
    private Acai acai;

    public Pedido(TipoPagamento tipoPagamento, Acai acai) {
        this.tipoPagamento = tipoPagamento;
        this.acai = acai;
    }

    public void valorTotalComDesconto(){
        double valorTotalComDescontos = 0.0;
        if (this.tipoPagamento.equals(TipoPagamento.PIX)){
            valorTotalComDescontos = this.acai.precoBase + this.acai.valorTotalDosSabores - 7.00;
            System.out.println("Valor total com desconto no PIX: R$ " + valorTotalComDescontos);
        } else {
            System.out.println("Valor total sem desconto: R$ " + this.acai.precoBase + this.acai.valorTotalDosSabores);
        }
    }
}
