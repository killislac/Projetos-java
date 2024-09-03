package OO.composicao;

public class CompraTest {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "Kamily";
        compra.adicionarItem(new Item("Caneta", 20, 2.50));
        compra.adicionarItem(new Item("Blusa", 3, 40));
        compra.adicionarItem(new Item("Celular", 1, 2000));
        compra.adicionarItem(new Item("Casa", 1, 500000));
        System.out.println(compra.itens.size());
        System.out.println(compra.obterValorTotal());
    }
}
