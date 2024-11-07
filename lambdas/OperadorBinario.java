package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(9.0, 2.6));

        BiFunction<Double, Double , String > resulatdo = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resulatdo.apply(9.0, 5.7));
    }
}
