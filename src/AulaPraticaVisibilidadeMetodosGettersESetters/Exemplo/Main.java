package AulaPraticaVisibilidadeMetodosGettersESetters.Exemplo;

public class Main {
    public static void main(String[] args) {
        //método construtor usado para inicializar o objeto
        Carro carro = new Carro("Preta", "NYI-2C88", "Renault", 938932332, "Everton");

        System.out.println(carro.getCor());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getMarca());
        System.out.println(carro.getCodigoRenavan());
        System.out.println("O proprietario do carro e o " + carro.getProprietario());

        // Usamos o setter quando queremos mudar alguma informação/atributo do objeto
        carro.setProprietario("Maxwell");
        System.out.println("Agora o novo proprietario deste carro e o " + carro.getProprietario());
    }
}
