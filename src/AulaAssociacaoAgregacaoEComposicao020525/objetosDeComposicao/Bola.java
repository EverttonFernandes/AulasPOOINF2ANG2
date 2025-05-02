package AulaAssociacaoAgregacaoEComposicao020525.objetosDeComposicao;

public class Bola {
    private String marca;
    private String cor;
    private String nomeDaBola;

    public Bola(String marca, String cor, String nomeDaBola) {
        this.marca = marca;
        this.cor = cor;
        this.nomeDaBola = nomeDaBola;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getNomeDaBola() {
        return nomeDaBola;
    }
}
