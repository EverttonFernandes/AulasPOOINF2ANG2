package AulaPraticaVisibilidadeMetodosGettersESetters.ExercicioFilme;

public class Filme {
    private String titulo;
    private int anoLancamento;
    private boolean disponivel;

    public Filme(String titulo, int anoLancamento, boolean disponivel){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
