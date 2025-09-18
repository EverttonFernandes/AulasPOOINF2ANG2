package AulaPraticaClassesAbstratasEoPrincipioAbertoFechado180925.exemploRuim;

public class Main {
    public static void main(String[] args) {
        // INSTANCIA REFERENTE A PAGAMENTO NO PIX
        Pagamento pagamentoPix = new Pagamento();
        pagamentoPix.setTipoPagamento(TipoPagamento.PIX);
        pagamentoPix.setChavePixDestinatario("444.555.777-31");
        pagamentoPix.setValorDoPix(200);
        pagamentoPix.efetuarPagamento();
        System.out.println("#####################################");
        // INSTANCIA REFERENTE A PAGAMENTO NO CRÉDITO

        Pagamento pagamentoCredito = new Pagamento();
        pagamentoCredito.setTipoPagamento(TipoPagamento.CREDITO);
        pagamentoCredito.setLimiteCartaoDeCredito(12000);
        pagamentoCredito.efetuarPagamento();

        System.out.println("#####################################");
        // INSTANCIA REFERENTE A PAGAMENTO NO CRÉDITO
        Pagamento pagamentoDebito = new Pagamento();
        pagamentoDebito.setTipoPagamento(TipoPagamento.DEBITO);
        pagamentoDebito.setSaldo(4000);
        pagamentoDebito.efetuarPagamento();
    }
}
