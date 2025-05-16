package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoWelynton;

public class Aluno {
    private String nomeAluno;
    private String matriculaAluno;

    public Aluno(String nomeAluno, String matriculaAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
}
