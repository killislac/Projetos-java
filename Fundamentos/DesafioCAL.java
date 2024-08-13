package Fundamentos;
import java.util.Scanner;

public class DesafioCAL {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Primeiro numero:");
        int valor1 = Integer.parseInt(entrada.next());

        System.out.println("Segundo numero:");
        int valor2 = Integer.parseInt(entrada.next());
        System.out.println("Qual operação voce quer?");
         String operacao = entrada.next();
        if (operacao.equals("+")) {
            System.out.println("Resultado: " + (valor1 + valor2));
        } else if (operacao.equals("-")) {
            System.out.println("Resultado: " + (valor1 - valor2));
        } else if (operacao.equals("*")) {
            System.out.println("Resultado: " + (valor1 * valor2));
        } else if (operacao.equals("/")) {
            if (valor2 != 0) {
                System.out.println("Resultado: " + ((double) valor1 / valor2));
            } else {
                System.out.println("Erro: Divisão por zero.");
            }
        } else {
            System.out.println("Operação inválida.");
        }
       entrada.close();

    }
}
