package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator <Double> calculo = (x, y) -> { return x + y;};

        //Java não consegue converter um tipo primitivo em um tipo classe
        // int -> Double
        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (x,y) -> x * y;
        System.out.println(calculo.apply(2.0, 3.0));
    }
}
