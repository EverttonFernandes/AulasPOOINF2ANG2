package AulaAssociacaoAgregacaoEComposicao020525.objetosDeComposicao;

public class Arbitro {
    private String nome;
    private String nomeDaFederacao;

    public Arbitro(String nome, String nomeDaFederacao) {
        this.nome = nome;
        this.nomeDaFederacao = nomeDaFederacao;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDaFederacao() {
        return nomeDaFederacao;
    }
}
