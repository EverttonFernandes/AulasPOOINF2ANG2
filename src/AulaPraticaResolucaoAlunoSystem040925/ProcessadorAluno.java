package AulaPraticaResolucaoAlunoSystem040925;

public class ProcessadorAluno {
    private AlunoRepositorio alunoRepositorio;
    private AcademicoService academicoService;
    private RelatorioService relatorioService;
    private FinanceiroService financeiroService;
    private OcorrenciaService ocorrenciaService;

    public ProcessadorAluno(AlunoRepositorio alunoRepositorio, AcademicoService academicoService, RelatorioService relatorioService, FinanceiroService financeiroService, OcorrenciaService ocorrenciaService) {
        this.alunoRepositorio = alunoRepositorio;
        this.academicoService = academicoService;
        this.relatorioService = relatorioService;
        this.financeiroService = financeiroService;
        this.ocorrenciaService = ocorrenciaService;
    }

    public AlunoRepositorio getAlunoRepositorio() {
        return alunoRepositorio;
    }

    public AcademicoService getAcademicoService() {
        return academicoService;
    }

    public RelatorioService getRelatorioService() {
        return relatorioService;
    }

    public FinanceiroService getFinanceiroService() {
        return financeiroService;
    }

    public OcorrenciaService getOcorrenciaService() {
        return ocorrenciaService;
    }
}
