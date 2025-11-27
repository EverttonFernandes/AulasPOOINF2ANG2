package AulaPraticaSimuladoProvaPratica271125.simuladoacai;

import java.util.ArrayList;
import java.util.List;

public abstract class Acai implements Removivel {
    protected String nomeDoTamanho;
    protected double precoBase;
    protected double valorTotalDosSabores;
    protected List<Sabor> listaSabores = new ArrayList<>();

    public Acai(String nomeDoTamanho, double precoBase) {
        this.nomeDoTamanho = nomeDoTamanho;
        this.precoBase = precoBase;
    }

    protected void mostrarValorTotalDosSaboresPagos() {
        System.out.println("Valor total dos sabores pagos do Açaí Pequeno: " + this.valorTotalDosSabores);
    }

    protected void calcularValorTotalDosSabores() {
        for (Sabor sabor : this.listaSabores) {
            if (!sabor.isGratuito()) {
                this.valorTotalDosSabores += sabor.getPrecoSabor();
            }
        }
    }

    @Override
    public void removerSabor(Sabor sabor) {
        // Implementação genérica e concreta para remover sabores de um acai
        if (this.listaSabores.removeIf(sabor::equals)) {
            System.out.println("Sabor removido com sucesso: " + sabor.getNomeSabor());
        } else {
            System.out.println("Sabor não encontrado: " + sabor.getNomeSabor());
        }
    }
}
