package IntroducaoMetodos.test;

import IntroducaoMetodos.dominio.CalculadoraJ;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        CalculadoraJ calculadora = new CalculadoraJ();
        int [ ] numeros = { 1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);
    }
}
