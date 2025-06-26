package AulaPraticaRevisaoProvaPratica200625.Exercicio5CadastroDePedidos;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Produto mouseGamer = new Produto("Mouse Gamer", 150.00);
        Produto tecladoMecanico = new Produto("Teclado Mecânico", 320.00);
        Produto headset = new Produto("Headset", 199.90);

        Pedido pedido1 = new Pedido("PEDIDO001");
        pedido1.adicionarProduto(mouseGamer);
        pedido1.adicionarProduto(tecladoMecanico);
        pedido1.gerarResumoPedido(true); // resumo mostrando o preço

        Pedido pedido2 = new Pedido("PEDIDO002", LocalDateTime.now());
        pedido2.adicionarProduto(headset);
        pedido2.gerarResumoPedido(false); // resumo sem mostrar os preços
    }
}

