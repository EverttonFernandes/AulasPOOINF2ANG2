package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoProfessor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado("LG");

        List<Computador> computadores = new ArrayList<>();
        Computador computador1 = new Computador("Dell1");
        Computador computador2 = new Computador("Dell2");
        Computador computador3 = new Computador("Dell3");
        computadores.add(computador1);
        computadores.add(computador2);
        computadores.add(computador3);

        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno("Zezinho", "123");
        Aluno aluno2 = new Aluno("Mariazinha", "345");
        Aluno aluno3 = new Aluno("Joaozinho", "888");
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        Laboratorio laboratorio = new Laboratorio(arCondicionado, computadores, alunos);
        laboratorio.exibirInformacoesValidandoAQuantidadeDeAlunos();
    }
}
