package aulaPratica140325.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Peça um número inteiro positivo e calcule a soma de todos os números de 1 até esse número.
         */
        Scanner criaTecladoParaObterONumeroDigitadoPeloUsuario = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = criaTecladoParaObterONumeroDigitadoPeloUsuario.nextInt();

        int somaTotal = 0;
        for (int i = 1; i <= numero; i++) {
            somaTotal += i;
        }
        System.out.println(somaTotal);
    }
}
