package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoWelynton;
import java.util.List;

public class Laboratorio {
    private String nomeLabo;
    private ArCondicionado arCondicionado;
    List<Computador> computadores;

    public Laboratorio(String nomeLabo, ArCondicionado arCondicionado, List<Computador> computadores) {
        this.nomeLabo = nomeLabo;
        this.arCondicionado = arCondicionado;
        this.computadores = computadores;
    }

    public ArCondicionado getArCondicionado() {
        return arCondicionado;
    }

    public List<Computador> getComputadores() {
        return computadores;
    }

    public String getNomeLabo() {
        return nomeLabo;
    }

    public void exibir() {
        System.out.println("O laboratorio: " + nomeLabo + " tem um arCondicionado da marca: " + arCondicionado.getMarca());
        System.out.println("Esse arCondicionado chega a temperatura de: " + arCondicionado.getTemperatura());
        System.out.println("O laboratorio possui um total de " + this.getComputadores().size() + " computadores!");

        for (Computador computador : this.getComputadores()) {
            if (computador.getAlunoList().size() >= 1 && computador.getAlunoList().size() < 3) {
                System.out.println("O computador " + computador.getModelo() + " possui a quantidade correta de alunos");
            } else if ((computador.getAlunoList().size() >= 3)) {
                System.out.println("O computador " + computador.getModelo() + " possui mais alunos");
            }
        }
    }
}