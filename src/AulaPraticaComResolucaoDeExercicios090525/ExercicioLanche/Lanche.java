package AulaPraticaComResolucaoDeExercicios090525.ExercicioLanche;

import java.util.ArrayList;
import java.util.List;

public class Lanche {
    private String nomeLanche;
    private List<String> listaDeIngredientes = new ArrayList<>();
    private double preco;

    public Lanche(String nomeLanche, double preco) {
        this.nomeLanche = nomeLanche;
        this.preco = preco;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public List<String> getListaDeIngredientes() {
        return listaDeIngredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionarIngrediente(String ingrediente) {
        this.listaDeIngredientes.add(ingrediente);
    }

    public void exibirInformacoes() {
        System.out.println("Nome do lanche: " + this.getNomeLanche());
        System.out.println("Preco do lanche: " + this.getPreco());
        System.out.println("Lista de ingredientes: \n");
        for (String ingrediente : this.getListaDeIngredientes()) {
            System.out.println("- " + ingrediente);
        }
    }
}
