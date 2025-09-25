package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploBom;

public abstract class MeioDeTransporteAereo {
    protected boolean temCombustivel;
    protected int quantidadeDePassageiros;

    protected MeioDeTransporteAereo(boolean temCombustivel, int quantidadeDePassageiros) {
        this.temCombustivel = temCombustivel;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    protected abstract void voar();
    protected abstract void aterrizar();
}
