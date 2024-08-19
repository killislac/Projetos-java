package Classes;

public class ValorNulo {
    public static void main(String[] args) {
        String nome = null;  // 'nome' não está apontando para nenhum objeto String
        if (nome != null) {
            System.out.println(nome.length());  // Só tenta acessar o método se 'nome' não for null
        }
    }


}
