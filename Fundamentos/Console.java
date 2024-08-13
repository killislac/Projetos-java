package Fundamentos;
import java.util.Scanner;

public class Console {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String historico= entrada.nextLine();
            System.out.println("Nome digitado:" +  historico);
            entrada.close();
        }
    }
