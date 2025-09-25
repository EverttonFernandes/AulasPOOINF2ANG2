package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploBom;

public class Navio extends MeioDeTransporteAquatico{

    public Navio(int quantidadeDePassageiros) {
        super(quantidadeDePassageiros);
    }

    @Override
    protected void navegar() {
        System.out.println("Navegando");
    }

    @Override
    protected void meioDeFreiar() {
        System.out.println("Usando âncora para freiar!");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando!");
    }
}
