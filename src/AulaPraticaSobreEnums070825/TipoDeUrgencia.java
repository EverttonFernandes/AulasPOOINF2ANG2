package AulaPraticaSobreEnums070825;

public enum TipoDeUrgencia {
    BAIXA(1, "O paciente pode aguardar por 2 horas"),
    INTERMEDIARIA(2, "O paciente pode aguardar por 30 minutos"),
    ALTA(3, "O paciente precisa ser atendido PRA ONTEM!");

    private final int numeroDaUrgencia;
    private final String descricaoProntuario;

    TipoDeUrgencia(int numeroDaUrgencia, String descricaoProntuario) {
        this.numeroDaUrgencia = numeroDaUrgencia;
        this.descricaoProntuario = descricaoProntuario;
    }

    // Exemplo na vida real: Usariamos esse int em cenários onde precisariamos salvar este inteiro em uma base de dados!
    public int getNumeroDaUrgencia() {
        return numeroDaUrgencia;
    }

    // Exemplo: Usamos este getDescricaoDoProntuario para padronizar a saida no console ajudando o sistema a ficar intuitivo para o usuario
    public String getDescricaoProntuario() {
        return descricaoProntuario;
    }
}
