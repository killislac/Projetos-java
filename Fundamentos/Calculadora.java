package Fundamentos;
import javax.swing.*;
public class Calculadora {


    public class CalculadoraJava {
        public static void main(String[] args) {
            String valor1 = JOptionPane.showInputDialog("Seu primeiro valor:");
            String valor2  = JOptionPane.showInputDialog("Seu segundo valor");
            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);

            int soma = numero1 + numero2;

        }
    }
}
