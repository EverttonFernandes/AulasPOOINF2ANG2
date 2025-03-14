package aulaPratica140325.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Solicite três notas e ao fim calcule a media aritmetica.
         * */
        Scanner criaTecladoParaOUsuarioDigitarAsNotas = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int primeiraNota = criaTecladoParaOUsuarioDigitarAsNotas.nextInt();

        System.out.println("Digite a segunda nota: ");
        int segundaNota = criaTecladoParaOUsuarioDigitarAsNotas.nextInt();

        System.out.println("Digite a terceira nota: ");
        int terceiraNota = criaTecladoParaOUsuarioDigitarAsNotas.nextInt();

        int resultadoFinal = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println(resultadoFinal);
    }
}