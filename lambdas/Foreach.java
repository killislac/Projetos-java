package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println("Forma tradicional:");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\nForma Lambda #1");

        // Para  cada nome da lista execute essa função Lambda = (nome) -> {System.out.println(nome + "!!!");}
        aprovados.forEach(nome -> {System.out.println(nome + "!!!");});

        System.out.println("\nMethod Reference #1");
        // A sintaxe System.out::println significa "para cada elemento da coleção, chame o método println de System.out passando esse elemento como argumento."
        aprovados.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------");

        System.out.println("\nForma Lambda #2");
        aprovados.forEach(nome -> {meuImprimir(nome);});

        System.out.println("\nMethod Reference #2");
        aprovados.forEach(Foreach::meuImprimir);
    }
    static void meuImprimir(String nome){
        System.out.println("Meu nome é" + nome);
    }
}
