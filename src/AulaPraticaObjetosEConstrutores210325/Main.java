package AulaPraticaObjetosEConstrutores210325;

public class Main {
    public static void main(String[] args) {
        // Sintaxe base para criar uma pessoa
        Pessoa nicoli = new Pessoa("Nicoli", 17, "234.000.876-55", "Brasileira");
        
        System.out.println("*******Apresentação da Nicoli*******");
        //sintaxe para mostrar na tela as informações do Jonas
        System.out.println("Ola pessoas, eu me chamo " +
                nicoli.nome + " tenho "
                + nicoli.idade + " anos" + " meu cpf e " + nicoli.cpf + " e sou " + nicoli.nacionalidade);
    }
}
