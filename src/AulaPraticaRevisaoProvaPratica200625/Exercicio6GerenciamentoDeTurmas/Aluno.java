package AulaPraticaRevisaoProvaPratica200625.Exercicio6GerenciamentoDeTurmas;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;

    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }
}
