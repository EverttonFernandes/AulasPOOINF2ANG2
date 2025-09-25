package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploRuim;

public class Navio extends MeioDeTransporte{

    // NAVIO QUEBRA O PRINCIPIO LSP
    public Navio(boolean temCombustivel, String cor, String marca, String modelo, String placa) {
        super(temCombustivel, cor, marca, modelo, placa);
    }

    @Override
    protected void acelerar() {
        throw new UnsupportedOperationException("Não acelara, deveria navegar");
    }

    @Override
    protected void freiar() {
        throw new UnsupportedOperationException("Não freia sem uma ancora");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando como um navio");
    }
}
