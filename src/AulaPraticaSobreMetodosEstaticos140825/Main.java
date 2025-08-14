package AulaPraticaSobreMetodosEstaticos140825;

public class Main {
    public static void main(String[] args) {
        // Quando o método é estático, não precisamos instanciar o objeto.
        System.out.println("Somando usando a classe com método estático!");
        CalculadoraComMetodoEstatico.somar(2, 2);
        System.out.println("######################################");

        // Quando o método é estático, precisamos criar uma instância da classe para chamar o método.
        CalculadoraNormal calculadoraNormal = new CalculadoraNormal();
        System.out.println("Somando usando a classe normal!");
        calculadoraNormal.somar(2, 2);
        System.out.println("######################################");

        // Usamos métodos estáticos em situações onde gostariamos de ter um comportamento genérico
        // em diferentes lugares, como por exemplo, somar, multiplicar ou fazer qualquer outra
        // operacao matematica para uma loja, uma lancheria, um banco, uma lotérica, escola e etc.
        // com isto não precisamos nos acoplar diretamente a classe, basta chamar o método estático.


    }
}
