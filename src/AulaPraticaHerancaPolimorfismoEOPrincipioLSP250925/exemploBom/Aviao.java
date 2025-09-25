package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploBom;

public class Aviao extends MeioDeTransporteAereo {

    public Aviao(boolean temCombustivel, int quantidadeDePassageiros) {
        super(temCombustivel, quantidadeDePassageiros);
    }

    @Override
    protected void voar() {
        System.out.println("Avião está voando!");
    }

    @Override
    protected void aterrizar() {
        System.out.println("Avião está aterrizando!");
    }
}
