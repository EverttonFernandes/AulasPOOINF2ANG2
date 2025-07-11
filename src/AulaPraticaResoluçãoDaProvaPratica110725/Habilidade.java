package AulaPraticaResoluçãoDaProvaPratica110725;

public class Habilidade {
    private String nome;
    private int poder;
    private String tipo;
    private boolean habilidadeDeAtaque;
    private boolean habilidadeDeDefesa;

    public Habilidade(String nome, int poder, String tipo, boolean habilidadeDeAtaque, boolean habilidadeDeDefesa) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
        this.habilidadeDeAtaque = habilidadeDeAtaque;
        this.habilidadeDeDefesa = habilidadeDeDefesa;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isHabilidadeDeAtaque() {
        return habilidadeDeAtaque;
    }

    public boolean isHabilidadeDeDefesa() {
        return habilidadeDeDefesa;
    }
}

