package AulaAssociacaoAgregacaoEComposicao020525;

import AulaAssociacaoAgregacaoEComposicao020525.objetosDeAgregacao.Torcedor;
import AulaAssociacaoAgregacaoEComposicao020525.objetosDeAssociacao.PlacaDePublicidade;
import AulaAssociacaoAgregacaoEComposicao020525.objetosDeComposicao.Arbitro;
import AulaAssociacaoAgregacaoEComposicao020525.objetosDeComposicao.Bola;

import java.util.List;

public class PartidaDeFutebol {
    // exemplos de composicao(objetos obrigatórios para uma partida de futebol)
    private Bola bola;
    private Arbitro arbitro;

    // exemplo de agregacao
    // (objeto que vive fora da partida de futebol, mas seria intessante te-lo na partida)
    private List<Torcedor> torcedores;

    // exemplo de associacao (objeto que tanto faz se existir, acoplamento zero dentro da partida de futebol)
    private List<PlacaDePublicidade> placasDePublicidade;

    private String nomeDaPartida;

    public PartidaDeFutebol(Bola bola, Arbitro arbitro, List<Torcedor> torcedores, List<PlacaDePublicidade> placasDePublicidade, String nomeDaPartida) {
        this.bola = bola;
        this.arbitro = arbitro;
        this.torcedores = torcedores;
        this.placasDePublicidade = placasDePublicidade;
        this.nomeDaPartida = nomeDaPartida;
    }

    public Bola getBola() {
        return bola;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public List<Torcedor> getTorcedores() {
        return torcedores;
    }

    public List<PlacaDePublicidade> getPlacasDePublicidade() {
        return placasDePublicidade;
    }

    public String getNomeDaPartida() {
        return nomeDaPartida;
    }

    public void exibirInformacoesDaPartidaDeFutebol() {
        System.out.println("############# INFORMAÇÕES DA PARTIDA DE HOJE #############");
        System.out.println("-Nome da partida: " + this.getNomeDaPartida());
        System.out.println("-Arbitro da partida: " + this.getArbitro().getNome() + " da federação " + this.getArbitro().getNomeDaFederacao());
        System.out.println("-Publico Pagante: " + this.getTorcedores().size() + " torcedores!");
        System.out.println("-Bola usada na partida: " + this.getBola().getNomeDaBola() + " com a cor " + this.getBola().getCor() + " e a marca " + this.getBola().getMarca());
        System.out.println("-Placa de publicidade da partida pertencente a empresa: " + this.getPlacasDePublicidade().get(0).getNomeDaEmpresa() + "!");

    }
}
