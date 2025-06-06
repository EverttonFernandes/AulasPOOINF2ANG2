package AulaPraticaSobrecargaDeMetodos060625.exemploMaisDidatico;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(5, 15));
        System.out.println(calculadora.somar(5, 15, 5));
        System.out.println(calculadora.somar(5F, 15F));
        System.out.println(calculadora.somar(5.0, 15.0));
    }
}
