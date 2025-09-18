package AulaPraticaClassesAbstratasEoPrincipioAbertoFechado180925.exemploCorreto;

public class Main {
    public static void main(String[] args) {
        // INSTANCIA REFERENTE A PAGAMENTO NO PIX RESPEITANDO O PRINCIPIO OCP
        PagamentoPix pagamentoPix = new PagamentoPix("222.444.555-65", 200);
        pagamentoPix.setSaldoDaConta(5000);
        pagamentoPix.efetuarPagamento();
        System.out.println("#####################################");

        // INSTANCIA REFERENTE A PAGAMENTO NO CARTÃO DE CRÉDITO RESPEITANDO O PRINCIPIO OCP
        PagamentoCredito pagamentoCredito = new PagamentoCredito(15000, 500);
        pagamentoCredito.efetuarPagamento();
        System.out.println("#####################################");
    }
}
