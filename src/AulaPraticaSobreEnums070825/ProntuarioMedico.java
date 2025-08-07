package AulaPraticaSobreEnums070825;

import javax.print.DocFlavor;

public class ProntuarioMedico {
    private String sintomasDoPaciente;
    private String nomeDoPaciente;
    private TipoDeUrgencia tipoDeUrgencia;

    public ProntuarioMedico(String sintomasDoPaciente, String nomeDoPaciente, TipoDeUrgencia tipoDeUrgencia) {
        this.sintomasDoPaciente = sintomasDoPaciente;
        this.nomeDoPaciente = nomeDoPaciente;
        this.tipoDeUrgencia = tipoDeUrgencia;
    }

    public String getSintomasDoPaciente() {
        return sintomasDoPaciente;
    }

    public String getNomeDoPaciente() {
        return nomeDoPaciente;
    }

    public TipoDeUrgencia getTipoDeUrgencia() {
        return tipoDeUrgencia;
    }

    public void exibirInformacoesSobreOProntuario() {
        System.out.println("Sintomas do paciente " + this.sintomasDoPaciente);
        System.out.println("Nome do paciente " + this.nomeDoPaciente);
        System.out.println("Tipo de urgencia do paciente " + this.tipoDeUrgencia.getDescricaoProntuario());
    }
}
