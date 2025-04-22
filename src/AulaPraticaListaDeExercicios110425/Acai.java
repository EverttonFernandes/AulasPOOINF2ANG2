package AulaPraticaListaDeExercicios110425;

import java.util.ArrayList;
import java.util.List;

public class Acai {
    private String tamanho;
    private List<String> listaDeSabores = new ArrayList<>();
    private Double preco;

    public Acai(String tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void inserirSabores(String sabor) {
        this.listaDeSabores.add(sabor);
    }

    public void exibirInformacoesDoAcai() {
        System.out.println("Abaixo as informacoes do seu pedido");
        System.out.println("O tamanho do acai e de " + this.tamanho);
        System.out.println("O seu preco e de " + this.preco + "R$");
        System.out.println("Com os devidos sabores selecionados");

        for (String sabor : this.listaDeSabores) {
            System.out.println(sabor);
        }
    }
}
