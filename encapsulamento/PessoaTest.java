package encapsulamento;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(30);
        p1.setIdade(60);

        System.out.println(p1.getIdade());
    }
}
