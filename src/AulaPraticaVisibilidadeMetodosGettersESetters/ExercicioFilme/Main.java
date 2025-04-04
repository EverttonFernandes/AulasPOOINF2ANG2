package AulaPraticaVisibilidadeMetodosGettersESetters.ExercicioFilme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Senhor dos Aneis", 1998, true);
        Filme filme2 = new Filme("Harry Potter", 1998, true);

        if (filme.isDisponivel()){
            System.out.println("O filme " + filme.getTitulo() + " lançado no ano " + filme.getAnoLancamento() + " está disponível!");
        }

        if (filme2.isDisponivel()){
            System.out.println("O filme " + filme2.getTitulo() + " lançado no ano " + filme2.getAnoLancamento() + " está disponível!");
        }

    }
}
