package AulaPraticaRevisaoProvaPratica200625;

public class Equipamento {
    private String nome;
    private String codigoPatrimonio;
    private String setor;

    public Equipamento(String nome, String codigoPatrimonio) {
        this.nome = nome;
        this.codigoPatrimonio = codigoPatrimonio;
    }

    public Equipamento(String nome, String codigoPatrimonio, String setor) {
        this.nome = nome;
        this.codigoPatrimonio = codigoPatrimonio;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public String getCodigoPatrimonio() {
        return codigoPatrimonio;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
