package Classes;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 234567.99;
        p1.desconto = 0.25;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);

    }
}
