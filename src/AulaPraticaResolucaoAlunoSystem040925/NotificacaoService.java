package AulaPraticaResolucaoAlunoSystem040925;

public class NotificacaoService {

    // ===== Notificação =====
    public static void enviarEmail(String destinatario, String assunto, String conteudo) {
        System.out.println("[EMAIL] Para: " + destinatario + " | " + assunto + " | " + conteudo);
    }
}
