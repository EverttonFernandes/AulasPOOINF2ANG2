package AulaPraticaRevisaoProvaPratica200625.Exercicio4SistemaDeAtendimento;

public class Atendente {
    private String nome;
    private String setor;

    public Atendente(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }
}
