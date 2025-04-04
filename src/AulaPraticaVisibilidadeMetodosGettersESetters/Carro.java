package AulaPraticaVisibilidadeMetodosGettersESetters;

public class Carro {
    // Usamos os atributos como private para dizer que eles agora são privados
    private String cor;
    private String placa;
    private String marca;
    private int codigoRenavan;
    private String proprietario;

    public Carro(String cor, String placa, String marca, int codigoRenavan, String proprietario) {
        this.cor = cor;
        this.placa = placa;
        this.marca = marca;
        this.codigoRenavan = codigoRenavan;
        this.proprietario = proprietario;
    }

    // abaixo métodos getters, usados para obter as informações privadas de um objeto
    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodigoRenavan() {
        return codigoRenavan;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }
}
