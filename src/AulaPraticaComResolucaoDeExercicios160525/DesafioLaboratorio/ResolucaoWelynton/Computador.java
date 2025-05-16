package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoWelynton;
import java.util.List;

public class Computador {
    private String modelo;
    private List<Aluno> alunoList;

    public Computador(String modelo, List<Aluno> alunoList) {
        this.modelo = modelo;
        this.alunoList = alunoList;
    }

    public String getModelo() {
        return modelo;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }
}
