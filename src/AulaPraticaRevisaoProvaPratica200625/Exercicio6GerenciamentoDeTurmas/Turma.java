package AulaPraticaRevisaoProvaPratica200625.Exercicio6GerenciamentoDeTurmas;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private String turno;
    private List<Aluno> listaDeAlunos = new ArrayList<>(); // existe uma agregação

    public Turma(String nome) {
        this.nome = nome;
    }

    public Turma(String turno, String nome) {
        this.turno = turno;
        this.nome = nome;
    }

    public Turma(String nome, String turno, List<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.turno = turno;
        this.listaDeAlunos = listaDeAlunos;
    }

    public void adicionarAluno(Aluno aluno) {
        listaDeAlunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos da turma " + this.nome);
        for (Aluno aluno : this.listaDeAlunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("Matricula: " + aluno.getMatricula());
        }
    }

    public void contarAlunos() {
        System.out.println("MOSTRANDO A QUANTIDADE DE ALUNOS");
        System.out.println("A quantidade de alunos na turma " + this.nome + " é: " + this.listaDeAlunos.size());
    }

    public void mostrarAlunoEspecifico(Aluno alunoEspecifico) {
        System.out.println("MOSTRANDO ALUNO ESPECÍFICO");
        for (Aluno aluno : this.listaDeAlunos) {
            if (alunoEspecifico.equals(aluno)) {
                System.out.println(alunoEspecifico.getNome());
            }
        }
    }

    public void removerAlunos() {
        listaDeAlunos.removeAll(this.listaDeAlunos);
    }

    public void removerAlunoEspecifico(Aluno alunoEspecifico) {
        System.out.println("REMOVENDO ALUNO ESPECÍFICO");
        System.out.println("O aluno " + alunoEspecifico.getNome() + " foi excluido com sucesso!");
        this.listaDeAlunos.removeIf(aluno -> aluno.equals(alunoEspecifico));
    }
}