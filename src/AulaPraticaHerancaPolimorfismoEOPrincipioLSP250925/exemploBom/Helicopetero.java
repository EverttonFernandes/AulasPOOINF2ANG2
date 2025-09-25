package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploBom;

public class Helicopetero extends MeioDeTransporteAereo{

    public Helicopetero(boolean temCombustivel, int quantidadeDePassageiros) {
        super(temCombustivel, quantidadeDePassageiros);
    }

    @Override
    protected void voar() {
        System.out.println("Helicopetero voando!");
    }

    @Override
    protected void aterrizar() {
        System.out.println("Helicopetero aterrizando!");
    }
}
