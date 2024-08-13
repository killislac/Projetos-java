package IntroducaoMetodos.test;

import IntroducaoMetodos.dominio.CalculadoraJ;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        CalculadoraJ calculadora = new CalculadoraJ();
        double result = calculadora.divideDoisNum(20,2); // variavel precisa iniciar com o mesmo tipo que o metodo esta
        System.out.println(result);
    }

}
