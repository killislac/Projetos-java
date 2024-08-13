package Classes;

public class Contrutor {
    String nome;
    int idade;

    // Construtor padrão
    public Contrutor() {
        nome = "Desconhecido";
        idade = 0;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
