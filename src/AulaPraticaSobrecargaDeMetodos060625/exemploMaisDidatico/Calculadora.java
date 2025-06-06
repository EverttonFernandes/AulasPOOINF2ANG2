package AulaPraticaSobrecargaDeMetodos060625.exemploMaisDidatico;

public class Calculadora {

    public int somar(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int somar(int valor1, int valor2, int valor3){
        return valor1 + valor2 + valor3;
    }

    public Float somar(Float valor1, Float valor2){
        return valor1 + valor2;
    }

    public Double somar(Double valor1, Double valor2){
        return valor1 + valor2;
    }
}
