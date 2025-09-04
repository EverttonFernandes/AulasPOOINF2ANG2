package AulaPraticaResolucaoAlunoSystem040925;

public class Main {
    // ===== MAIN para demonstrar o fluxo =====
    public static void main(String[] args) {
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
        AcademicoService academicoService = new AcademicoService(alunoRepositorio);
        RelatorioService relatorioService = new RelatorioService(academicoService, alunoRepositorio);
        FinanceiroService financeiroService = new FinanceiroService(alunoRepositorio);
        OcorrenciaService ocorrenciaService = new OcorrenciaService(alunoRepositorio);
        ProcessadorAluno processadorAluno = new ProcessadorAluno(alunoRepositorio, academicoService, relatorioService, financeiroService, ocorrenciaService);

        processadorAluno.getAlunoRepositorio().cadastrarAluno("2025001", "Ana", "ana@ifsul.edu", Serie.PRIMEIRO);
        processadorAluno.getAcademicoService().registrarNota("2025001", 8);
        processadorAluno.getAcademicoService().registrarNota("2025001", 4.5);
        processadorAluno.getFinanceiroService().registrarPagamento("2025001", 250.00);

        StatusPagamento status = processadorAluno.getFinanceiroService().verificarStatusPagamento("2025001", 250.00);
        System.out.println("Status financeiro: " + status.getRotulo());

        processadorAluno.getOcorrenciaService().registrarAdvertenciaPorFaltaEmAvaliacao("2025001", true);
        processadorAluno.getRelatorioService().exportarCSV();
    }
}


