package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoLaura;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private final ArCondicionado arcondicionado;
    private String nome;
    private ArCondicionado arCondicionado;
    private List<Computador> computadores;
    private List<Aluno> alunosLogados;
    private int totalAlunos = 0;

    public Laboratorio(String nome, ArCondicionado arcondicionado) {
        this.nome = nome;
        this.arcondicionado = arcondicionado;
        this.computadores = new ArrayList<>();
    }

    public ArCondicionado getArcondicionado() {
        return arcondicionado;
    }

    public void adicionarComputador(Computador computador) {
        computadores.add(computador);
    }

    public void verificarCapacidadeEExibirInformacoes() {
        totalAlunos = 0;
        for (Computador computador : computadores) {
            totalAlunos += computador.getalunosLogados().size();
        }

        if (totalAlunos <= computadores.size()) {
            System.out.println("Há computadores suficientes para todos os alunos.");
        } else {
            exibirInformacoes();
        }
    }

    public void exibirInformacoes() {
        System.out.println("############INFORMAÇÕES REFERENTE AO LABORATÓRIO COM SEUS COMPUTADORES E ALUNOS############");
        System.out.println("Nome do laboratótio " + this.nome);
        System.out.println("Ar condiconado " + this.getArcondicionado().getinfo());

        System.out.println("Informações dos alunos(as) logados");
        for (Computador computador : computadores) {
            for (Aluno aluno : computador.getalunosLogados()) {
                System.out.println("  - " + aluno.getNome());
            }
        }

        System.out.println("Informações dos computadores usados pelos (as) alunos (as)");
        for (Computador computador : computadores) {
            System.out.println("  - " + computador.getModelo());
        }

        System.out.println("Quantidade de alunos logados e: " + totalAlunos);
    }
}



