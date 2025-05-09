package AulaPraticaComResolucaoDeExercicios090525.ExercicioLanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá informe o nome do lanche: ");
        String nomeDoLanche = scanner.nextLine();

        System.out.println("Olá informe o preco do lanche: ");
        Double precoDoLanche = scanner.nextDouble();

        Lanche lanche = new Lanche(nomeDoLanche, precoDoLanche);

        System.out.println("Informe os ingrediente: ");

        for (int i = 1; i <= 4 ; i++) {
            String ingrediente = scanner.next();
            lanche.adicionarIngrediente(ingrediente);
        }

        scanner.close();
        lanche.exibirInformacoes();
    }
}
