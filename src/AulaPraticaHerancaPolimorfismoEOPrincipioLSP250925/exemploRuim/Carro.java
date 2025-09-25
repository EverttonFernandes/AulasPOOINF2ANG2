package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploRuim;

public class Carro extends MeioDeTransporte{

    public Carro(boolean temCombustivel, String cor, String marca, String modelo, String placa) {
        super(temCombustivel, cor, marca, modelo, placa);
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    protected void freiar() {
        System.out.println("Freiando");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando");
    }
}
