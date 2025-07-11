package AulaPraticaResoluçãoDaProvaPratica110725;

import java.util.Random;

public class Batalha {

    public static void simularBatalha(Personagem p1, Personagem p2) throws InterruptedException {
        System.out.println("🔔 Iniciando a batalha entre " + p1.getNome() + " e " + p2.getNome() + "...\n");

        Thread.sleep(1000);
        System.out.println("⏳ Preparando o campo de batalha...");
        Thread.sleep(1000);
        System.out.println("🔥 Lutadores posicionados. Vamos ao combate!\n");

        Thread.sleep(1500);

        Random random = new Random();
        int vencedor = random.nextInt(2);

        String nomeVencedor = vencedor == 0 ? p1.getNome() : p2.getNome();
        String nomePerdedor = vencedor == 0 ? p2.getNome() : p1.getNome();

        System.out.println("✅ " + nomeVencedor + " venceu a batalha contra " + nomePerdedor + "!");
        System.out.println("👏 Parabéns ao vencedor!\n");
    }
}
