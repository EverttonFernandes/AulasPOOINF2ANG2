package AulaPraticaObjetosEConstrutores210325;

public class Main {
    public static void main(String[] args) {
        // Sintaxe base para criar uma pessoa
        Pessoa maria = new Pessoa("Maria", 40, "873.091.478-73", "Brasileira");
        Pessoa jonas = new Pessoa("Jonas", 17, "876.398.871.11", "Brasileiro");
        Pessoa nicoli = new Pessoa("Nicoli", 17, "234.000.876-55", "Brasileira");

        //sintaxe para mostrar na tela as informações da Maria
        System.out.println("*******Apresentação da Maria*******");
        System.out.println(maria.nome);
        System.out.println(maria.idade);
        System.out.println(maria.cpf);
        System.out.println(maria.nacionalidade);

        System.out.println("*******Apresentação do Jonas*******");
        //sintaxe para mostrar na tela as informações do Jonas
        System.out.println(jonas.nome);
        System.out.println(jonas.idade);
        System.out.println(jonas.cpf);
        System.out.println(jonas.nacionalidade);

        System.out.println("*******Apresentação da Nicoli*******");
        //sintaxe para mostrar na tela as informações do Jonas
        System.out.println("Ola pessoas, eu me chamo " +
                nicoli.nome + " tenho "
                + nicoli.idade + " anos" + " meu cpf e " + nicoli.cpf + " e sou " + nicoli.nacionalidade);
    }
}
