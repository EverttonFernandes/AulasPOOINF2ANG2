package AulaPraticaSobrecargaDeMetodos060625.exemploMaisReal;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaDeLivros = new ArrayList<>();
    private String nomeBiblioteca;
    private boolean possuiArCondicionado;
    private boolean possuiComputadores;

    public Biblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public Biblioteca(String nomeBiblioteca, boolean possuiArCondicionado, boolean possuiComputadores) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.possuiArCondicionado = possuiArCondicionado;
        this.possuiComputadores = possuiComputadores;
    }

    public Biblioteca(List<Livro> listaDeLivros, String nomeBiblioteca, boolean possuiArCondicionado, boolean possuiComputadores) {
        this.listaDeLivros = listaDeLivros;
        this.nomeBiblioteca = nomeBiblioteca;
        this.possuiArCondicionado = possuiArCondicionado;
        this.possuiComputadores = possuiComputadores;
    }

    public void adicionarLivros(Livro livro){
        this.listaDeLivros.add(livro);
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public void setPossuiComputadores(boolean possuiComputadores) {
        this.possuiComputadores = possuiComputadores;
    }
}
