package AulaPraticaClassesAbstratasEoPrincipioAbertoFechado180925.exemploRuim;

public class Pagamento {
    private String chavePixDestinatario;
    private double valorDoPix;
    private double saldo;
    private double limiteCartaoDeCredito;
    private TipoPagamento tipoPagamento;

    public Pagamento() {

    }

    public Pagamento(String chavePixDestinatario, double valorDoPix, double saldo, double limiteCartaoDeCredito, TipoPagamento tipoPagamento) {
        this.chavePixDestinatario = chavePixDestinatario;
        this.valorDoPix = valorDoPix;
        this.saldo = saldo;
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
        this.tipoPagamento = tipoPagamento;
    }

    public void setChavePixDestinatario(String chavePixDestinatario) {
        this.chavePixDestinatario = chavePixDestinatario;
    }

    public void setValorDoPix(double valorDoPix) {
        this.valorDoPix = valorDoPix;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimiteCartaoDeCredito(double limiteCartaoDeCredito) {
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void efetuarPagamento() {
        if (this.tipoPagamento.equals(TipoPagamento.PIX)) {
            if (this.chavePixDestinatario != null && !this.chavePixDestinatario.isEmpty()) {
                if (this.valorDoPix > 0) {
                    System.out.println("Pix efetuado no valor " + this.valorDoPix + " para a chave destino " + this.chavePixDestinatario);
                }
            }
        }

        if (this.tipoPagamento.equals(TipoPagamento.CREDITO)){
            if (this.limiteCartaoDeCredito > 0){
                System.out.println("Pagamento efetuado no cartão de crédito");
            }
        }

        if (this.tipoPagamento.equals(TipoPagamento.DEBITO)){
            if (this.saldo > 0){
                System.out.println("Pagamento efetuado no débito");
            }
        }
    }
}
