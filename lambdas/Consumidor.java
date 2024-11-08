package lambdas;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 2 , 0);
        imprimir.accept(p1);
    }
}
