package AulaPraticaHerancaPolimorfismoEOPrincipioLSP250925.exemploBom;

public class Main {
    public static void main(String[] args) {
        Aviao aviaoDaLatam = new Aviao(true, 40);
        aviaoDaLatam.voar();
        aviaoDaLatam.aterrizar();

        System.out.println("#################################");

        Helicopetero helicopeteroParticular = new Helicopetero(true, 5);
        helicopeteroParticular.voar();
        helicopeteroParticular.aterrizar();

        System.out.println("#################################");

        Navio navio = new Navio(20);
        navio.navegar();
        navio.buzinar();
        navio.meioDeFreiar();
    }
}
