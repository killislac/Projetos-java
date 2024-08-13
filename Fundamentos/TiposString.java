package Fundamentos;

public class TiposString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(4));



        var nome = "kAmily";
        var sobrenome = "Lacerda";
        var idade = 18;

        System.out.printf("Dados: %s %s tem %d", nome, sobrenome, idade);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
    }
}
