package AulaPraticaSimuladoProvaPratica271125.simuladoacai;

public class Main {
    public static void main(String[] args) {
        Sabor saborMorango = new Sabor("Morango", 5.0, false);
        Sabor cremeRafaello = new Sabor("Creme Rafaello", 5.0, false);
        Sabor nutella = new Sabor("Nutella", 5.0, false);
        Sabor cremeLeitinho = new Sabor("Creme Leitinho", 5.0, false);

//        AcaiPequeno acaiPequeno = new AcaiPequeno("Açaí Pequeno", 10.0);
//        acaiPequeno.adicionarSabor(saborMorango);
//        acaiPequeno.adicionarSabor(cremeRafaello);
//        acaiPequeno.adicionarSabor(nutella);

        // CREME LEITINHO VAI ESTOURAR A EXCEÇÃO
//        acaiPequeno.adicionarSabor(cremeLeitinho);
//        acaiPequeno.calcularValorTotalDosSabores();

        AcaiMedio acaiMedio = new AcaiMedio("Açaí Medio", 15.0);
        acaiMedio.adicionarSabor(saborMorango);
        acaiMedio.adicionarSabor(cremeRafaello);
        acaiMedio.adicionarSabor(nutella);
        acaiMedio.adicionarSabor(cremeLeitinho);
        acaiMedio.calcularValorTotalDosSabores();

//        Pedido pedidoDoAcaiPequeno = new Pedido(TipoPagamento.PIX, acaiPequeno);
//        pedidoDoAcaiPequeno.valorTotalComDesconto();

        Pedido pedidoDoAcaiMedio = new Pedido(TipoPagamento.PIX, acaiMedio);
        pedidoDoAcaiMedio.valorTotalComDesconto();
    }
}
