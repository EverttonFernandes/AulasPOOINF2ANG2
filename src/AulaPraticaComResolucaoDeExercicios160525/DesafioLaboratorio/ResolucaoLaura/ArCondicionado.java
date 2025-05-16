package AulaPraticaComResolucaoDeExercicios160525.DesafioLaboratorio.ResolucaoLaura;

public class ArCondicionado {
    private String marca;
    private int temperatura;

    public ArCondicionado(String marca, int temperatura){
        this.marca = marca;
        this.temperatura = temperatura;
    }
    public String getinfo(){

        return marca + " - " +  temperatura + "°C";
    }

}
