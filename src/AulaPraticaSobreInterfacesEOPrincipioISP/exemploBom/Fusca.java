package AulaPraticaSobreInterfacesEOPrincipioISP.exemploBom;

import AulaPraticaSobreInterfacesEOPrincipioISP.Veiculo;
import AulaPraticaSobreInterfacesEOPrincipioISP.exemploRuim.Funcionalidades;

public class Fusca extends Veiculo {
    @Override
    protected void acelerar() {
        System.out.println("Acelerando o Fusca...");
    }

    @Override
    protected void freiar() {
        System.out.println("Freando o Fusca...");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando o Fusca...");
    }
}
