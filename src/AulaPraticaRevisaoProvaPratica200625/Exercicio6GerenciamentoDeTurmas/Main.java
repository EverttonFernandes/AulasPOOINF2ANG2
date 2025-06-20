package AulaPraticaRevisaoProvaPratica200625.Exercicio6GerenciamentoDeTurmas;

public class Main {
    public static void main(String[] args) {
        Aluno joaquim = new Aluno("Joaquim", "3736873", "joaquim@ifsul.edu.br");
        Aluno agatha = new Aluno("Agatha", "88888", "agatha@ifsul.edu.br");
        Aluno cecilia = new Aluno("Cecilia", "55555555", "cecilia@ifsul.edu.br");
        Aluno erica = new Aluno("Erica", "88372732", "erica@ifsul.edu.br");
        Aluno esther = new Aluno("Esther", "1111111", "esther@ifsul.edu.br");
        Aluno adao = new Aluno("Adao", "222222", "adao@ifsul.edu.br");

        Turma turma = new Turma("Manhã", "INF2AM");

        turma.adicionarAluno(joaquim);
        turma.adicionarAluno(agatha);
        turma.adicionarAluno(cecilia);
        turma.adicionarAluno(erica);
        turma.adicionarAluno(esther);
        turma.adicionarAluno(adao);

        turma.listarAlunos();
        turma.contarAlunos();
        turma.mostrarAlunoEspecifico(agatha);
//        turma.removerAlunos();
        turma.mostrarAlunoEspecifico(erica);
        turma.removerAlunoEspecifico(adao);
        turma.listarAlunos();
    }
}
