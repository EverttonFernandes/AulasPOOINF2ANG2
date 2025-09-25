package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploRuim;

public abstract class MeioDeTransporte {
    protected boolean temCombustivel;
    protected String cor;
    protected String marca;
    protected String modelo;
    protected String placa;

    protected MeioDeTransporte(boolean temCombustivel, String cor, String marca, String modelo, String placa) {
        this.temCombustivel = temCombustivel;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    protected abstract void acelerar();
    protected abstract void freiar();
    protected abstract void buzinar();
}
