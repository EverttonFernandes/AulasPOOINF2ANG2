package AulaPraticaResolucaoAlunoSystem040925;

public class RelatorioService {

    private AcademicoService academicoService;
    private AlunoRepositorio alunoRepositorio;

    public RelatorioService(AcademicoService academicoService, AlunoRepositorio alunoRepositorio) {
        this.academicoService = academicoService;
        this.alunoRepositorio = alunoRepositorio;
    }

    // ===== Relatórios =====
    public void exportarCSV() {
        System.out.println("[EXPORT] alunos.csv");
        for (Aluno aluno : alunoRepositorio.getListaDeAlunos()) {
            double media = academicoService.calcularMedia(aluno.getRa());
            System.out.println(
                    aluno.getRa() + ";" +
                            aluno.getNome() + ";" +
                            aluno.getEmail() + ";" +
                            aluno.getSerie() + ";" +
                            media
            );
        }
    }
}
