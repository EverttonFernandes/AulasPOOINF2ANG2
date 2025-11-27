package AulaPraticaSimuladoProvaPratica271125.simuladoacai;

public class Sabor {
    private String nomeSabor;
    private double precoSabor;
    private boolean gratuito;

    public Sabor(String nomeSabor, double precoSabor, boolean gratuito) {
        this.nomeSabor = nomeSabor;
        this.precoSabor = precoSabor;
        this.gratuito = gratuito;
    }

    public String getNomeSabor() {
        return nomeSabor;
    }

    public double getPrecoSabor() {
        return precoSabor;
    }

    public boolean isGratuito() {
        return gratuito;
    }
}
