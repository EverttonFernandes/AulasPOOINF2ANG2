package AulaPraticaRevisaoProvaPratica200625.Exercicio4SistemaDeAtendimento;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Atendente camila = new Atendente("Camila", "Suporte");
        Atendente carlos = new Atendente("Carlos", "Comercial");

        Atendimento atendimento1 = new Atendimento("PROTO123", camila);
        atendimento1.exibirDetalhesAtendimento();

        atendimento1.trocarAtendente(carlos);
        atendimento1.exibirDetalhesAtendimento();

        Atendimento atendimento2 = new Atendimento("PROTO456", LocalDateTime.now(), carlos);
        atendimento2.exibirDetalhesAtendimento();
    }
}

