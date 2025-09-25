package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploRuim;

public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro(true, "vermelho", "fusca", "antigoFusca", "IJK-9934");
        fusca.acelerar();
        fusca.buzinar();
        fusca.freiar();
    }
}
