package AulaPraticaListaDeExercicios110425;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, por favor informe o tamanho do seu acai");
        Scanner scanner = new Scanner(System.in);
        String tamanhoDoAcai = scanner.next();

        Acai acai = new Acai(tamanhoDoAcai, 18.00);

        System.out.println("Informe 3 sabores para montar seu acai");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Sabor " + i);
            String saborSelecionado = scanner.next();
            acai.inserirSabores(saborSelecionado);
        }
        acai.exibirInformacoesDoAcai();
        scanner.close();
    }
}
