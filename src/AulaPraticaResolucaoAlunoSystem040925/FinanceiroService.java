package AulaPraticaResolucaoAlunoSystem040925;

public class FinanceiroService {

    private AlunoRepositorio alunoRepositorio;

    public FinanceiroService(AlunoRepositorio alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }

    // ===== Pagamentos =====
    public void registrarPagamento(String ra, double valorPago) {
        Aluno aluno = alunoRepositorio.validarExistencia(ra);
        if (aluno == null) return;

        aluno.getPagamentos().add(valorPago);
        System.out.println("[PAGAMENTO] RA " + ra + " pagou " + Dinheiro.formatar(valorPago));

    }

    public StatusPagamento verificarStatusPagamento(String ra, double valorMensalidade) {
        Aluno aluno = alunoRepositorio.validarExistencia(ra);
        if (aluno == null) return StatusPagamento.ATRASADO;

        double totalPago = 0;
        for (double valor : aluno.getPagamentos()) totalPago += valor;

        return (totalPago >= valorMensalidade) ? StatusPagamento.EM_DIA : StatusPagamento.ATRASADO;
    }
}
