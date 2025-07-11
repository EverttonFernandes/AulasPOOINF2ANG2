package AulaPraticaResoluçãoDaProvaPratica110725;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Habilidades do Goku
        Habilidade kamehameha = new Habilidade("Kamehameha", 10, "Ki", true, false);
        Habilidade teletransporte = new Habilidade("Teletransporte", 7, "Movimento", false, true);
        Habilidade genkiDama = new Habilidade("Genki Dama", 10, "Ki", true, false);
        Habilidade ultraInstinto = new Habilidade("Ultra Instinto", 10, "Híbrida", true, true);

        // Habilidades do Vegeta
        Habilidade finalFlash = new Habilidade("Final Flash", 10, "Ki", true, false);
        Habilidade bigBang = new Habilidade("Big Bang Attack", 9, "Ki", true, false);
        Habilidade galickHo = new Habilidade("Galick Ho", 8, "Ki", true, false);
        Habilidade egoSuperior = new Habilidade("Ego Superior", 10, "Hibrido", true, true);

        // Cria Goku usando o construtor com nome e a classe do personsagem (sobrecarga)
        Personagem goku = new Personagem("Goku", "Sayajin");

        // Cria o Vegeta usando o construtor completo (sobrecarga)
        Personagem vegeta = new Personagem("Vegeta");

        // Adiciona as habilidades ao Goku
        goku.adicionarHabilidade(kamehameha);
        goku.adicionarHabilidade(teletransporte);
        goku.adicionarHabilidade(genkiDama);
        goku.adicionarHabilidade(ultraInstinto);
        goku.adicionarHabilidade(kamehameha); // Teste duplicidade

        // Adiciona as habilidades do Vegeta
        vegeta.adicionarHabilidade(finalFlash);
        vegeta.adicionarHabilidade(bigBang);
        vegeta.adicionarHabilidade(galickHo);
        vegeta.adicionarHabilidade(egoSuperior);

        vegeta.setClasse("Sayajin"); // Usa setter, pois o construtor utilizado como sobrecarga foi o construtor que tem apenas o nome!

        System.out.println("\n==== GOKU ====");
        goku.listarHabilidadesDeAtaque();
        goku.listarHabilidadesDeDefesa();
        goku.listarHabilidadesDeAtaqueEDefesa();
        goku.contarHabilidades();
        goku.removerHabilidade("Teletransporte");
        goku.removerHabilidade("Destruição"); // não existe

        System.out.println("\n==== VEGETA ====");
        vegeta.listarHabilidadesDeAtaque();
        vegeta.listarHabilidadesDeDefesa();
        vegeta.listarHabilidadesDeAtaqueEDefesa();
        vegeta.contarHabilidades();
        vegeta.removerHabilidade("Big Bang Attack");
        vegeta.removerHabilidade("Teletransporte"); // não existe

        Batalha.simularBatalha(goku, vegeta); // simula uma batalha entre o Goku e o Vegeta!
    }
}

