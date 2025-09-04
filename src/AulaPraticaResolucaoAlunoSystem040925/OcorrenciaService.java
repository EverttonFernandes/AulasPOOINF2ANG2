package AulaPraticaResolucaoAlunoSystem040925;

public class OcorrenciaService {

    private AlunoRepositorio alunoRepositorio;

    public OcorrenciaService(AlunoRepositorio alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }

    public void registrarAdvertenciaPorFaltaEmAvaliacao(String ra, boolean faltou) {
        Aluno aluno = alunoRepositorio.validarExistencia(ra);
        if (aluno == null) return;

        if (faltou) {
            System.out.println("[OCORRENCIA] RA " + ra + " recebeu advertência por falta em avaliação.");
            NotificacaoService.enviarEmail(aluno.getEmail(),
                    "Advertência registrada",
                    "Compareça à coordenação para ciência.");
        }
    }
}
