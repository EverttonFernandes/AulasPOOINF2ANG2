package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoLaura;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private String modelo;
    private List<Aluno> alunosLogados;

    public Computador(String modelo) {
        this.modelo = modelo;
        this.alunosLogados = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosLogados.add(aluno);
    }

    public List<Aluno> getalunosLogados() {
        return alunosLogados;
    }

    public String getModelo() {
        return modelo;
    }
}

