package AulaPraticaRevisaoProvaPratica200625.Exercicio5CadastroDePedidos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String numero;
    private LocalDateTime data;
    private List<Produto> produtos;

    public Pedido(String numero) {
        this.numero = numero;
        this.data = LocalDateTime.now();
        this.produtos = new ArrayList<>();
    }

    public Pedido(String numero, LocalDateTime data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }

    public void gerarResumoPedido() {
        this.gerarResumoPedido(true);
    }

    public void gerarResumoPedido(boolean mostrarPrecos) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Pedido Nº: " + numero);
        System.out.println("Data: " + data.format(formatter));
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            if (mostrarPrecos) {
                System.out.println("- " + p.getNome() + " - R$ " + String.format("%.2f", p.getValor()));
            } else {
                System.out.println("- " + p.getNome());
            }
        }
        if (mostrarPrecos) {
            System.out.println("Total: R$ " + String.format("%.2f", calcularValorTotal()));
        }
        System.out.println("-----------------------------------");
    }
}

