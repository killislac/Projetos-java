package Fundamentos;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensagem = "";

        // Loop que continua até o usuário digitar "sair"
        while (!mensagem.equalsIgnoreCase("sair")) {
            System.out.println("Digite uma mensagem (ou 'sair' para encerrar):");
            mensagem = entrada.nextLine(); // Use nextLine() para ler uma linha completa
        }

        System.out.println("Programa encerrado.");
        entrada.close(); // Fechar o scanner
    }
}