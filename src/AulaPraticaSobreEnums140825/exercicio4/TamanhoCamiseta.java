package AulaPraticaSobreEnums140825.exercicio4;

public enum TamanhoCamiseta {
    PP(1, "Extra Pequeno"),
    P(2, "Pequeno"),
    M(3, "Médio"),
    G(4, "Grande"),
    GG(5, "Extra Grande");

    private final int tamanho;
    private final String descricao;

    TamanhoCamiseta(int tamanho, String descricao) {
        this.tamanho = tamanho;
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getDescricao() {
        return descricao;
    }
}
