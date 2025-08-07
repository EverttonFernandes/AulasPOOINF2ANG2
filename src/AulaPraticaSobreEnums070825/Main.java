package AulaPraticaSobreEnums070825;

public class Main {
    public static void main(String[] args) {
        ProntuarioMedico prontuarioMedico = new ProntuarioMedico("Falta de ar", "Pedrinho", TipoDeUrgencia.ALTA);
        prontuarioMedico.exibirInformacoesSobreOProntuario();
    }
}
