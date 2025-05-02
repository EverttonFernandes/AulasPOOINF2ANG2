package AulaAssociacaoAgregacaoEComposicao020525.objetosDeAgregacao;

public class Torcedor {
    private String nome;
    private String nomeDoTimeDeCoracao;

    public Torcedor(String nome, String nomeDoTimeDeCoracao) {
        this.nome = nome;
        this.nomeDoTimeDeCoracao = nomeDoTimeDeCoracao;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDoTimeDeCoracao() {
        return nomeDoTimeDeCoracao;
    }
}
