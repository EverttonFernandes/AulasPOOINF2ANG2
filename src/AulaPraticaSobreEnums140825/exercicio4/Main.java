package AulaPraticaSobreEnums140825.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Camiseta camiseta1 = new Camiseta("Azul", "Listras", TamanhoCamiseta.P);
        Camiseta camiseta2 = new Camiseta("Verde", "Xadrez", TamanhoCamiseta.M);
        Camiseta camiseta3 = new Camiseta("Preta", "Pedrinhas", TamanhoCamiseta.G);
        Camiseta camiseta4 = new Camiseta("Amarelo", "Bolinhas", TamanhoCamiseta.GG);

        List<Camiseta> listaDeCamisetas = new ArrayList<>(); // a lista nasce vazia
        listaDeCamisetas.add(camiseta1);
        listaDeCamisetas.add(camiseta2);
        listaDeCamisetas.add(camiseta3);
        listaDeCamisetas.add(camiseta4);
        // ao fim temos todas as camisetas na lista

        for (Camiseta camiseta : listaDeCamisetas) {
            System.out.println("####################");
            camiseta.exibirInformacoes();
            System.out.println("####################");
        }
    }
}
