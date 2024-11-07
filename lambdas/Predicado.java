package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = banada -> (banada.preco * (1 - banada.desconto)) >= 750;

        Produto produto = new Produto("Garrafa", 20,10);
        System.out.println(isCaro.test(produto));
    }
}
