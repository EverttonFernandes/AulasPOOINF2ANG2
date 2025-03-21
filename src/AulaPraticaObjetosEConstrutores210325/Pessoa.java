package AulaPraticaObjetosEConstrutores210325;

public class Pessoa {
    // Atributos/Caracteristicas de um objeto
    String nome;
    int idade;
    String cpf;
    String nacionalidade;

    // Método construtores (usado para conseguir criar o objeto)
    Pessoa(String nome, int idade, String cpf, String nacionalidade){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
    }

}
