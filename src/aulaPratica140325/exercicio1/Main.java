package aulaPratica140325.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Peça ao usuário dois números inteiros e informe qual é o maior.
         * Se forem iguais, avise que são iguais.*/
        Scanner criaTecladoParaOUsuarioDigitarNumeros = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = criaTecladoParaOUsuarioDigitarNumeros.nextInt();

        System.out.println("Digite o primeiro numero: ");
        int segundoNumero = criaTecladoParaOUsuarioDigitarNumeros.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O numero ".concat(String.valueOf(primeiroNumero))
                    .concat(" eh maior que o numero ")
                    .concat(String.valueOf(segundoNumero)));
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O numero ".concat(String.valueOf(segundoNumero))
                    .concat(" eh maior que o numero ")
                    .concat(String.valueOf(primeiroNumero)));
        } else {
            System.out.println("Os numeros informados sao iguais!");
        }
    }
}
