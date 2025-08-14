package AulaPraticaSobreEnums140825.exercicio4;

public class Camiseta {
    private String cor;
    private String estampa;
    private TamanhoCamiseta tamanho;

    public Camiseta(String cor, String estampa, TamanhoCamiseta tamanho) {
        this.cor = cor;
        this.estampa = estampa;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getEstampa() {
        return estampa;
    }

    public TamanhoCamiseta getTamanho() {
        return tamanho;
    }

    public void exibirInformacoes() {
        System.out.println("A cor da camiseta é " + this.getCor());
        System.out.println("A estampa da camiseta é " + this.getEstampa());
        System.out.println("E o tamanho da camiseta é " + this.getTamanho().getDescricao());
    }
}
