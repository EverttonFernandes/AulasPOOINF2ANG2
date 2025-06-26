package AulaPraticaRevisaoProvaPratica200625.Exercicio4SistemaDeAtendimento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Atendimento {

    private String protocolo;
    private LocalDateTime data;
    private Atendente atendente;

    public Atendimento(String protocolo, Atendente atendente) {
        this.protocolo = protocolo;
        this.data = LocalDateTime.now(); // se não passar a data, assume a data atual
        this.atendente = atendente;
    }

    public Atendimento(String protocolo, LocalDateTime data, Atendente atendente) {
        this.protocolo = protocolo;
        this.data = data;
        this.atendente = atendente;
    }

    public void exibirDetalhesAtendimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // aqui só formatei a data, mas como comentei acima daria para ser string e colocar direto a data de hoje
        System.out.println("Protocolo: " + protocolo);
        System.out.println("Data: " + data.format(formatter));
        System.out.println("Atendente: " + atendente.getNome());
        System.out.println("Setor: " + atendente.getSetor());
        System.out.println("----------------------------------");
    }

    public void trocarAtendente(Atendente novoAtendente) {
        this.atendente = novoAtendente;
        System.out.println("Atendente trocado com sucesso para " + novoAtendente.getNome());
    }
}

