package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoWelynton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado("sansung", 20);
        Aluno aluno1 = new Aluno("carlos", "001");
        Aluno aluno2 = new Aluno("andre", "002");
        Aluno aluno3 = new Aluno("barbo", "003");
        List<Aluno> listaComMaisDeUmAluno = new ArrayList<>();
        listaComMaisDeUmAluno.add(aluno1);
        listaComMaisDeUmAluno.add(aluno2);
        listaComMaisDeUmAluno.add(aluno3);

        List<Aluno> listaComUmAluno = new ArrayList<>();
        listaComUmAluno.add(aluno3);

        Computador computador1 = new Computador("LeNovo", listaComMaisDeUmAluno);
        Computador computador2 = new Computador("Dell", listaComUmAluno);
        List<Computador> computadorList = new ArrayList<>();
        computadorList.add(computador1);
        computadorList.add(computador2);
        Laboratorio laboratorio = new Laboratorio("Cad", arCondicionado, computadorList);
        laboratorio.exibir();
    }
}