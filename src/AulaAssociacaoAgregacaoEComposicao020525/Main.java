package AulaAssociacaoAgregacaoEComposicao020525;

import AulaAssociacaoAgregacaoEComposicao020525.objetosDeAgregacao.Torcedor;
import AulaAssociacaoAgregacaoEComposicao020525.objetosDeAssociacao.PlacaDePublicidade;
import AulaAssociacaoAgregacaoEComposicao020525.objetosDeComposicao.Arbitro;
import AulaAssociacaoAgregacaoEComposicao020525.objetosDeComposicao.Bola;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos de composicao
        Bola bola = new Bola("Adidas", "Branca", "Jabulani");
        Arbitro arbitro = new Arbitro("Anderson Daronco", "CBF");

        //Instanciando objeto de agregacao;
        Torcedor torcedor1 = new Torcedor("Matheus", "Gremio");
        Torcedor torcedor2 = new Torcedor("Katherine", "Gremio");
        Torcedor torcedor3 = new Torcedor("Welygton", "Inter");
        Torcedor torcedor4 = new Torcedor("Manu", "Inter");

        List<Torcedor> listaDeTorcedores = new ArrayList<>();
        listaDeTorcedores.add(torcedor1);
        listaDeTorcedores.add(torcedor2);
        listaDeTorcedores.add(torcedor3);
        listaDeTorcedores.add(torcedor4);

        //Instanciando objeto de associacao
        PlacaDePublicidade placaDePublicidade = new PlacaDePublicidade("Nike");
        List<PlacaDePublicidade> listaDePlacasDePublicidade = new ArrayList<>();
        listaDePlacasDePublicidade.add(placaDePublicidade);

        PartidaDeFutebol partidaDeFutebol = new PartidaDeFutebol(bola, arbitro, listaDeTorcedores, listaDePlacasDePublicidade, "ClassicoGrenal");

        partidaDeFutebol.exibirInformacoesDaPartidaDeFutebol();
    }
}
