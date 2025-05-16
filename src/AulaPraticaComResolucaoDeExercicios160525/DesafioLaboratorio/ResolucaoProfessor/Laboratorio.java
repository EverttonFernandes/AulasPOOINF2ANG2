package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoProfessor;

import java.util.List;

public class Laboratorio {

    private ArCondicionado arCondicionado;
    private List<Computador> listaDeComputadores;
    private List<Aluno> listaDeAlunos;

    public Laboratorio(ArCondicionado arCondicionado, List<Computador> listaDeComputadores, List<Aluno> listaDeAlunos) {
        this.arCondicionado = arCondicionado;
        this.listaDeComputadores = listaDeComputadores;
        this.listaDeAlunos = listaDeAlunos;
    }

    public ArCondicionado getArCondicionado() {
        return arCondicionado;
    }

    public List<Computador> getListaDeComputadores() {
        return listaDeComputadores;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void exibirInformacoesValidandoAQuantidadeDeAlunos() {
        // size é usado para pegar o tamanho da lista
        if (this.getListaDeAlunos().size() == this.getListaDeComputadores().size()) {
            System.out.println("SUCESSO: O laboratorio criado possui a quantidade esperada de alunos e computadores");
        }

        if (this.getListaDeAlunos().size() > this.getListaDeComputadores().size()) {
            System.out.println("ERRO: O laboratorio criado possui mais alunos do que computadores");
        }

        if (this.getListaDeComputadores().size() > this.getListaDeAlunos().size()) {
            System.out.println("SUCESSO:O laboratorio criado possui mais computadores do que alunos");
        }
    }
}
