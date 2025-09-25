package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploBom;

public abstract class MeioDeTransporteAquatico {
    protected int quantidadeDePassageiros;

    public MeioDeTransporteAquatico(int quantidadeDePassageiros) {
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    protected abstract void navegar();
    protected abstract void meioDeFreiar();
    protected abstract void buzinar();
}
