package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoLaura;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Manu", "001");
        Aluno aluno2 = new Aluno("Taine", "002");
        Aluno aluno3 = new Aluno("Laura", "003");

        ArCondicionado arcondiconado = new ArCondicionado("sansung", 20);

        Laboratorio laboratorio1 = new Laboratorio("Cad", arcondiconado);

        Computador computador1 = new Computador("Lenovo");
        Computador computador2 = new Computador("Dell");

        computador1.adicionarAluno(aluno1);
        computador2.adicionarAluno(aluno2);
        computador2.adicionarAluno(aluno3);

        laboratorio1.adicionarComputador(computador1);
        laboratorio1.adicionarComputador(computador2);

        laboratorio1.verificarCapacidadeEExibirInformacoes();
    }
}
