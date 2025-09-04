package AulaPraticaResolucaoAlunoSystem040925;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositorio {

    // ===== "Banco" em memória com LISTA =====
    private final List<Aluno> listaDeAlunos = new ArrayList<>();

    // ===== Cadastro =====
    public void cadastrarAluno(String ra, String nome, String email, Serie serie) {
        if (buscarAlunoPorRa(ra) != null) {
            System.out.println("[ERRO] Já existe aluno com RA " + ra);
            return;
        }
        Aluno novoAluno = new Aluno(ra, nome, email, serie);
        listaDeAlunos.add(novoAluno);

        System.out.println("[CADASTRO] " + nome + " cadastrado na série " + serie);
        NotificacaoService.enviarEmail(email, "Bem-vindo(a)!", "Seu cadastro foi criado com sucesso.");
    }

    public Aluno validarExistencia(String ra) {
        Aluno aluno = buscarAlunoPorRa(ra);
        if (aluno == null) {
            System.out.println("[ERRO] Aluno não encontrado: " + ra);
        }
        return aluno;
    }

    private Aluno buscarAlunoPorRa(String ra) {
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getRa().equals(ra)) return aluno;
        }
        return null;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }
}
