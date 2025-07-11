package AulaPraticaResoluçãoDaProvaPratica110725;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private String classe;
    private List<Habilidade> listaHabilidades = new ArrayList<>();

    public Personagem(String nome) {
        this.nome = nome;
    }

    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public Personagem(String nome, String classe, List<Habilidade> listaHabilidades) {
        this.nome = nome;
        this.classe = classe;
        this.listaHabilidades = listaHabilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void adicionarHabilidade(Habilidade habilidadeInformada) {
        for (Habilidade habilidade : listaHabilidades) {
            if (habilidade.getNome().equals(habilidadeInformada.getNome())) {
                System.out.println("Habilidade '" + habilidadeInformada.getNome() + "' já existe para o personagem " + nome + "!");
                break;
            }
        }
        listaHabilidades.add(habilidadeInformada);
        System.out.println("Habilidade '" + habilidadeInformada.getNome() + "' adicionada ao personagem " + nome + "!");
    }

    public void removerHabilidade(String nomeHabilidade) {
        boolean removido = listaHabilidades.removeIf(habilidade -> habilidade.getNome().equals(nomeHabilidade));
        if (removido) {
            System.out.println("Habilidade '" + nomeHabilidade + "' removida do personagem " + nome + "!");
        } else {
            System.out.println("Habilidade '" + nomeHabilidade + "' não encontrada para remoção!");
        }
    }

    public void listarHabilidadesDeAtaque() {
        System.out.println("Habilidades de Ataque do " + nome + ":");
        boolean temHabilidadeDeAtaque = false;
        for (Habilidade habilidade : listaHabilidades) {
            if (habilidade.isHabilidadeDeAtaque() && !habilidade.isHabilidadeDeDefesa()) {
                System.out.println("- " + habilidade.getNome() + " | Poder: " + habilidade.getPoder() + " | Tipo: " + habilidade.getTipo());
                temHabilidadeDeAtaque = true;
            }
        }
        if (!temHabilidadeDeAtaque) {
            System.out.println("Nenhuma habilidade de ataque encontrada.");
        }
    }

    public void listarHabilidadesDeDefesa() {
        System.out.println("Habilidades de Defesa do " + nome + ":");
        boolean temHabilidadeDeDefesa = false;
        for (Habilidade habilidade : listaHabilidades) {
            if (habilidade.isHabilidadeDeDefesa() && !habilidade.isHabilidadeDeAtaque()) {
                System.out.println("- " + habilidade.getNome() + " | Poder: " + habilidade.getPoder() + " | Tipo: " + habilidade.getTipo());
                temHabilidadeDeDefesa = true;
            }
        }
        if (!temHabilidadeDeDefesa) {
            System.out.println("Nenhuma habilidade de defesa encontrada.");
        }
    }

    public void listarHabilidadesDeAtaqueEDefesa() {
        System.out.println("Habilidades de Ataque e Defesa do " + nome + ":");
        boolean temHabilidadeDeAtaqueEDefesa = false;
        for (Habilidade habilidade : listaHabilidades) {
            if (habilidade.isHabilidadeDeAtaque() && habilidade.isHabilidadeDeDefesa()) {
                System.out.println("- " + habilidade.getNome() + " | Poder: " + habilidade.getPoder() + " | Tipo: " + habilidade.getTipo());
                temHabilidadeDeAtaqueEDefesa = true;
            }
        }
        if (!temHabilidadeDeAtaqueEDefesa) {
            System.out.println("Nenhuma habilidade híbrida encontrada.");
        }
    }

    public void contarHabilidades() {
        System.out.println("O personagem " + nome + " possui " + listaHabilidades.size() + " habilidades.");
    }

}

